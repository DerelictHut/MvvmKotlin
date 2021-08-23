package com.dh.app.nav

import com.dh.base.BindingFragment
import com.dh.app.R
import com.dh.app.databinding.FragmentNav2Binding

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