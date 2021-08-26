package com.dh.login.ui.activity

import com.alibaba.android.arouter.facade.annotation.Route
import com.dh.base.utils.ResUtils
import com.dh.comn.comn.ComnRouterPath
import com.dh.comn.ui.activity.BaseResultOfDisplayActivity
import com.dh.login.R

/**
 * @author wjl
 */
@Route(path = ComnRouterPath.Login.LOGIN_LOGIN_ACTIVITY)
class LoginActivity : BaseResultOfDisplayActivity() {

    override fun initVariable() {
        mBinding.tvShow.text = ResUtils.getString(R.string.login)
    }

    override fun initListener() {

    }
}