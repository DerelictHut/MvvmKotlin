package com.derelicthut.basecode.mvvmkotlin

import android.os.Bundle
import android.view.View
import com.derelicthut.basecode.base.BindingFragment
import com.derelicthut.basecode.base.utils.ResUtils
import com.derelicthut.basecode.mvvmkotlin.databinding.FragmentMainBinding

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