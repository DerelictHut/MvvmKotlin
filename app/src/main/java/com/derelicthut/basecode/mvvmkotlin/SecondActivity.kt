package com.derelicthut.basecode.mvvmkotlin

import com.blankj.utilcode.util.BarUtils
import com.derelicthut.basecode.base.BindingActivity
import com.derelicthut.basecode.base.extension.getVm
import com.derelicthut.basecode.mvvmkotlin.databinding.ActivitySecondBinding
import com.derelicthut.basecode.mvvmkotlin.vm.SecondVm

/**
 * @author wjl
 */
class SecondActivity : BindingActivity<ActivitySecondBinding>() {

    override fun initVariable() {
        mBinding.secondVm = getVm(SecondVm::class.java)
        BarUtils.addMarginTopEqualStatusBarHeight(mBinding.tvNav)
    }

    override fun initListener() {

    }

    override fun layoutId(): Int = R.layout.activity_second
}