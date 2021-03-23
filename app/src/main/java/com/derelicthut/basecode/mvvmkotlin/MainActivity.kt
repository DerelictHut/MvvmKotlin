package com.derelicthut.basecode.mvvmkotlin

import android.os.Bundle
import com.blankj.utilcode.util.LogUtils
import com.derelicthut.basecode.base.BindingActivity
import com.derelicthut.basecode.base.mvvm.getVm
import com.derelicthut.basecode.base.utils.StatusBarCompat
import com.derelicthut.basecode.base.utils.setOnDebouncingClickListener
import com.derelicthut.basecode.mvvmkotlin.databinding.ActivityMainBinding

class MainActivity : BindingActivity<ActivityMainBinding>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        StatusBarCompat.expendStatusBarHeight(mBinding.vTop)
        mBinding.tvTitle.text = "binding"
        mBinding.tvTitle.setOnDebouncingClickListener {
            val mainVm = getVm(MainVm::class.java)
            mainVm["key", String::class.java].value = "12"
            LogUtils.e(mainVm["key", String::class.java].value)
        }

    }

    override fun layoutId(): Int = R.layout.activity_main
}