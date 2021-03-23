package com.derelicthut.basecode.base

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

/**
 * @author wjl
 */
abstract class BindingActivity<VDB : ViewDataBinding> : BaseActivity(), IBindingInjector<VDB> {
    protected lateinit var mBinding: VDB

    override fun setBinding(binding: VDB) {
        mBinding = binding
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setBinding(DataBindingUtil.setContentView(this, layoutId()))
    }
}