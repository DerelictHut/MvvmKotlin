package com.derelicthut.basecode.mvvmkotlin.vm

import com.blankj.utilcode.util.ActivityUtils
import com.derelicthut.basecode.base.mvvm.BaseViewModel
import com.derelicthut.basecode.mvvmkotlin.nav.TestNavActivity

/**
 * @author wjl
 */
class SecondVm : BaseViewModel() {
    fun startTestNavActivity() {
        ActivityUtils.startActivity(TestNavActivity::class.java)
    }
}