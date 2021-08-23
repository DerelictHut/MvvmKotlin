package com.dh.base.dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.DialogFragment
import com.dh.base.IBindingInjector
import com.dh.base.InitListener

/**
 * @author wjl
 */
abstract class BaseDialogFragment<VDB : ViewDataBinding> : DialogFragment(), InitListener,
    IBindingInjector<VDB> {
    protected lateinit var mRootView: View
    protected val mBundle: Bundle? by lazy { arguments }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        mRootView = inflater.inflate(layoutId(), container, false)
        return mRootView
    }
}