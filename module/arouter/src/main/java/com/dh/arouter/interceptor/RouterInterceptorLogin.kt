package com.dh.arouter.interceptor

import android.content.Context
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.annotation.Interceptor
import com.alibaba.android.arouter.facade.callback.InterceptorCallback
import com.alibaba.android.arouter.facade.template.IInterceptor
import com.blankj.utilcode.util.LogUtils
import com.dh.base.utils.router.DhRouter
import com.dh.comn.comn.ComnRouterInterceptConfig
import com.dh.comn.comn.ComnRouterPath
import com.dh.comn.comn.interceptParse

/**
 * @author wjl
 */
@Interceptor(priority = 4, name = "登录拦截器")
class RouterInterceptorLogin : IInterceptor {
    override fun process(postcard: Postcard, callback: InterceptorCallback) {
        val intercept = postcard.interceptParse(ComnRouterInterceptConfig.INTERCEPT_LOGIN)
        LogUtils.i("登录拦截验证：$intercept")
        if (intercept) {
            //拦截条件，demo随机数
            if (Math.random() > 0.95) {
                callback.onInterrupt(Exception("还未登录"))
                DhRouter.nav(ComnRouterPath.Login.LOGIN_LOGIN_ACTIVITY)
                return
            }
        }
        callback.onContinue(postcard)
    }

    override fun init(context: Context?) {

    }
}