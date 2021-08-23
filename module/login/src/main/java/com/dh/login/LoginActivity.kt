package com.dh.login

import com.alibaba.android.arouter.facade.annotation.Route
import com.dh.base.BindingActivity
import com.dh.comn.comn.ComnRouterPath
import com.dh.login.databinding.ActivityLoginBinding

/**
 * @author wjl
 */
@Route(path = ComnRouterPath.LOGIN_LOGIN_ACTIVITY)
class LoginActivity : BindingActivity<ActivityLoginBinding>() {
    override fun layoutId(): Int = R.layout.activity_login

    override fun initVariable() {

    }

    override fun initListener() {

    }
}