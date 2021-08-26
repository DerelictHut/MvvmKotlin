package com.dh.setting.ui.activity

import com.alibaba.android.arouter.facade.annotation.Route
import com.dh.base.utils.ResUtils
import com.dh.comn.comn.ComnRouterPath
import com.dh.comn.ui.activity.BaseResultOfDisplayActivity
import com.dh.setting.R

/**
 * @author wjl
 */
@Route(path = ComnRouterPath.Setting.SETTING_REAL_NAME_ACTIVITY)
class RealNameActivity : BaseResultOfDisplayActivity() {

    override fun initVariable() {
        mBinding.tvShow.text = ResUtils.getString(R.string.real_name)
    }

    override fun initListener() {

    }
}