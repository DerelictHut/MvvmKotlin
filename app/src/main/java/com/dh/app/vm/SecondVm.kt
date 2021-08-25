package com.dh.app.vm

import com.blankj.utilcode.util.ActivityUtils
import com.dh.app.arouter.ui.activity.ARouterActivity
import com.dh.base.mvvm.BaseViewModel
import com.dh.app.nav.TestNavActivity
import com.dh.setting.ui.activity.SettingActivity

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

    fun startARouterActivity() {
        ActivityUtils.startActivity(ARouterActivity::class.java)
    }
}