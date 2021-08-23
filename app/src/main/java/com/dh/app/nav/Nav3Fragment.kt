package com.dh.app.nav

import com.dh.app.R
import com.dh.base.BindingFragment
import com.dh.app.databinding.FragmentNav3Binding

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