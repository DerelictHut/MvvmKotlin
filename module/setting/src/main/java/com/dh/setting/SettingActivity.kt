package com.dh.setting

import com.dh.base.BindingActivity
import com.dh.base.utils.router.DhRouter
import com.dh.comn.comn.ComnRouterPath
import com.dh.setting.databinding.ActivitySettingBinding

class SettingActivity : BindingActivity<ActivitySettingBinding>() {
    override fun layoutId(): Int = R.layout.activity_setting

    override fun initVariable() {
        mBinding.tvGoToLogin.setOnClickListener {
            DhRouter.nav(ComnRouterPath.LOGIN_LOGIN_ACTIVITY)
        }
    }

    override fun initListener() {

    }
}