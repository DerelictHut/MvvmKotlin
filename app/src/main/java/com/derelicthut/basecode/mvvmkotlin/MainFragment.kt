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
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding.clContainer.setBackgroundColor(ResUtils.getColor(R.color.black))
    }

    override fun layoutId(): Int = R.layout.fragment_main

}