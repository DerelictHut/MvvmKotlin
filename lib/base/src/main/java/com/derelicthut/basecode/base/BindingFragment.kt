package com.derelicthut.basecode.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.annotation.IdRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.derelicthut.basecode.base.extension.finishActivity
import com.derelicthut.basecode.base.extension.getNavSwitcher
import com.derelicthut.basecode.base.utils.NavSwitcher

/**
 * @author wjl
 */
abstract class BindingFragment<VDB : ViewDataBinding> : BaseFragment(), IBindingInjector<VDB>,
    InitListener {
    protected lateinit var mBinding: VDB
    protected var callback: OnBackPressedCallback? = null
    private var mNavSwitcher: NavSwitcher? = null

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
        initVariable()
        initListener()
        return mBinding.root
    }

    protected open fun handleKeyBack(): Boolean {
        return true
    }

    protected open fun onBackPressed() {
        if (handleKeyBack()) {
            if (!nav().navigateUp()) {
                finishActivity()
            }
        }
    }

    open fun navigateUp() {
        onBackPressed()
    }

    open fun navigate(@IdRes actionId: Int) {
        nav().navigate(actionId)
    }

    private fun nav() = mNavSwitcher ?: getNavSwitcher()
}