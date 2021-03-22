package com.derelicthut.basecode.mvvmkotlin

import android.os.Bundle
import android.view.View
import com.blankj.utilcode.util.LogUtils
import com.derelicthut.basecode.base.BindActivity
import com.derelicthut.basecode.base.mvvm.getVm
import com.derelicthut.basecode.base.utils.setOnDebouncingClickListener
import com.derelicthut.basecode.mvvmkotlin.databinding.ActivityMainBinding

class MainActivity : BindActivity<ActivityMainBinding>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding.textView.text = "binding"
        mBinding.textView.setOnDebouncingClickListener {
            val mainVm = getVm(MainVm::class.java)
            mainVm["key", String::class.java].value = "12"
            LogUtils.e(mainVm["key", String::class.java].value)
        }

    }

    override fun layoutId(): Int = R.layout.activity_main
}