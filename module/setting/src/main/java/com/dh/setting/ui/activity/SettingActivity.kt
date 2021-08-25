package com.dh.setting.ui.activity

import com.dh.base.BindingActivity
import com.dh.base.utils.router.DhRouter
import com.dh.comn.comn.ComnRouterPath
import com.dh.setting.R
import com.dh.setting.databinding.ActivitySettingBinding

class SettingActivity : BindingActivity<ActivitySettingBinding>() {
    override fun layoutId(): Int = R.layout.activity_setting

    override fun initVariable() {

    }

    override fun initListener() {
        mBinding.tvGoToLogin.setOnClickListener {
            DhRouter.nav(ComnRouterPath.Login.LOGIN_LOGIN_ACTIVITY)
        }
    }
}