package com.derelicthut.basecode.mvvmkotlin.nav

import com.derelicthut.basecode.base.BaseNavActivity
import com.derelicthut.basecode.base.BindingFragment
import com.derelicthut.basecode.mvvmkotlin.R
import com.derelicthut.basecode.mvvmkotlin.databinding.FragmentNav2Binding

/**
 * @author wjl
 */
class Nav2Fragment : BindingFragment<FragmentNav2Binding>() {
    override fun layoutId(): Int = R.layout.fragment_nav2

    override fun initVariable() {
        mBinding.navFrg = this
    }

    override fun initListener() {

    }
}