package com.dh.app.arouter.interceptor

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
@Interceptor(priority = 5, name = "实名认证拦截器")
class RouterInterceptorRealName : IInterceptor {
    override fun process(postcard: Postcard, callback: InterceptorCallback) {
        val intercept = postcard.interceptParse(ComnRouterInterceptConfig.INTERCEPT_REAL_NAME)
        LogUtils.i("实名认证拦截验证：$intercept")
        if (intercept) {
            if (Math.random() > 0.95) {
                callback.onInterrupt(Exception("未实名认证"))
                DhRouter.nav(ComnRouterPath.Setting.SETTING_REAL_NAME_ACTIVITY)
                return
            }
        }
        callback.onContinue(postcard)
    }

    override fun init(context: Context?) {

    }
}