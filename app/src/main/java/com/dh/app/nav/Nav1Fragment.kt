package com.dh.app.nav

import com.dh.base.BindingFragment
import com.dh.app.R
import com.dh.app.databinding.FragmentNav1Binding

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