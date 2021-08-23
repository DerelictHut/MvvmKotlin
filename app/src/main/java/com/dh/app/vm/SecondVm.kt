package com.dh.app.vm

import com.blankj.utilcode.util.ActivityUtils
import com.dh.base.mvvm.BaseViewModel
import com.dh.app.nav.TestNavActivity
import com.dh.setting.SettingActivity

/**
 * @author wjl
 */
class SecondVm : BaseViewModel() {
    fun startTestNavActivity() {
        ActivityUtils.startActivity(TestNavActivity::class.java)
    }

    fun startSettingActivity() {
        ActivityUtils.startActivity(SettingActivity::class.java)
    }
}