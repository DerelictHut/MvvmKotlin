package com.dh.app

import com.dh.base.BindingFragment
import com.dh.base.utils.ResUtils
import com.dh.app.databinding.FragmentMainBinding

/**
 * @author wjl
 */
class MainFragment : BindingFragment<FragmentMainBinding>() {
    override fun initVariable() {
        mBinding.clContainer.setBackgroundColor(ResUtils.getColor(R.color.black))
    }

    override fun initListener() {

    }

    override fun layoutId(): Int = R.layout.fragment_main
}