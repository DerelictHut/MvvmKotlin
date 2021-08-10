package com.derelicthut.basecode.mvvmkotlin.nav

import com.derelicthut.basecode.base.BaseNavActivity
import com.derelicthut.basecode.base.BindingFragment
import com.derelicthut.basecode.mvvmkotlin.R
import com.derelicthut.basecode.mvvmkotlin.databinding.FragmentNav1Binding

/**
 * @author wjl
 */
class Nav1Fragment : BindingFragment<FragmentNav1Binding>() {
    override fun layoutId(): Int = R.layout.fragment_nav1

    override fun initVariable() {
        mBinding.navFrg = this
    }

    override fun initListener() {

    }
}