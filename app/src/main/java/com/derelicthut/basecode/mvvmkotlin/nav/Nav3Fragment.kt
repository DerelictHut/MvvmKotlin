package com.derelicthut.basecode.mvvmkotlin.nav

import com.derelicthut.basecode.base.BaseNavActivity
import com.derelicthut.basecode.base.BindingFragment
import com.derelicthut.basecode.mvvmkotlin.R
import com.derelicthut.basecode.mvvmkotlin.databinding.FragmentNav3Binding

/**
 * @author wjl
 */
class Nav3Fragment : BindingFragment<FragmentNav3Binding>() {
    override fun layoutId(): Int = R.layout.fragment_nav3

    override fun initVariable() {
        mBinding.navFrg = this
    }

    override fun initListener() {

    }
}