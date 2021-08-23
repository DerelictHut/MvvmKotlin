package com.dh.app

import com.blankj.utilcode.util.ActivityUtils
import com.blankj.utilcode.util.BarUtils
import com.blankj.utilcode.util.LogUtils
import com.dh.base.BindingActivity
import com.dh.base.extension.getVm
import com.dh.base.extension.setOnDebouncingClickListener
import com.dh.app.databinding.ActivityMainBinding
import com.dh.app.vm.MainVm

class MainActivity : BindingActivity<ActivityMainBinding>() {
    override fun initVariable() {
        BarUtils.addMarginTopEqualStatusBarHeight(mBinding.tvTitle)
        mBinding.tvTitle.text = "binding"
    }

    override fun initListener() {
        mBinding.tvTitle.setOnDebouncingClickListener {
            val mainVm = getVm(MainVm::class.java)
            mainVm["key", String::class.java].value = "12"
            LogUtils.e(mainVm["key", String::class.java].value)
            ActivityUtils.startActivity(SecondActivity::class.java)
        }
    }

    override fun layoutId(): Int = R.layout.activity_main
}