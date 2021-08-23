package com.dh.app

import com.blankj.utilcode.util.BarUtils
import com.dh.base.BindingActivity
import com.dh.base.extension.getVm
import com.dh.app.databinding.ActivitySecondBinding
import com.dh.app.vm.SecondVm

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