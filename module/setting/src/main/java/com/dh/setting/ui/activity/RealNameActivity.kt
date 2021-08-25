package com.dh.setting.ui.activity

import com.alibaba.android.arouter.facade.annotation.Route
import com.dh.base.BindingActivity
import com.dh.comn.comn.ComnRouterPath
import com.dh.setting.R
import com.dh.setting.databinding.ActivityRealNameBinding

/**
 * @author wjl
 */
@Route(path = ComnRouterPath.Setting.SETTING_REAL_NAME_ACTIVITY)
class RealNameActivity : BindingActivity<ActivityRealNameBinding>() {
    override fun layoutId(): Int = R.layout.activity_real_name

    override fun initVariable() {

    }

    override fun initListener() {

    }
}