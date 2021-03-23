package com.derelicthut.basecode.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

/**
 * @author wjl
 */
abstract class BindingFragment<VDB : ViewDataBinding> : BaseFragment(), IBindingInjector<VDB> {
    protected lateinit var mBinding: VDB
    protected var callback: OnBackPressedCallback? = null

    override fun setBinding(binding: VDB) {
        mBinding = binding
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (handleKeyBack()) {
            requireActivity().onBackPressedDispatcher.addCallback(this,
                object : OnBackPressedCallback(true) {
                    override fun handleOnBackPressed() {
                        onBackPressed()
                    }
                }.also { callback = it })
        }
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        setBinding(DataBindingUtil.inflate(inflater, layoutId(), container, false))
        return mBinding.root
    }

    protected open fun handleKeyBack(): Boolean {
        return true
    }

    open fun finishActivity() {
        activity?.apply { finish() }
    }

    protected open fun onBackPressed() {
        if (handleKeyBack()) {
            finishActivity()
        }
    }
}