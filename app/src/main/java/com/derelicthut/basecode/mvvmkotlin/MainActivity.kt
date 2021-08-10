package com.derelicthut.basecode.mvvmkotlin

import com.blankj.utilcode.util.ActivityUtils
import com.blankj.utilcode.util.BarUtils
import com.blankj.utilcode.util.LogUtils
import com.derelicthut.basecode.base.BindingActivity
import com.derelicthut.basecode.base.extension.getVm
import com.derelicthut.basecode.base.extension.setOnDebouncingClickListener
import com.derelicthut.basecode.mvvmkotlin.databinding.ActivityMainBinding
import com.derelicthut.basecode.mvvmkotlin.vm.MainVm

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