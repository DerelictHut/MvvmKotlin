package com.dh.base

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter
import com.blankj.utilcode.util.AppUtils
import com.blankj.utilcode.util.Utils
import com.dh.base.utils.ScreenMatcher

/**
 * @author wjl
 */
open class BaseApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Utils.init(this)
        ScreenMatcher.fix()
        initARouter()
    }

    private fun initARouter() {
        if (AppUtils.isAppDebug()) {
            // 打印日志
            ARouter.openLog()
            // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
            ARouter.openDebug()
        }
        ARouter.init(this)
    }
}