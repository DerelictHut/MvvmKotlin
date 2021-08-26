package com.dh.app

import com.blankj.utilcode.util.LogUtils
import com.blankj.utilcode.util.ThreadUtils
import com.dh.base.BaseApp
import com.dh.base.R
import com.dh.base.utils.BaseUtils
import com.dh.base.utils.router.IModuleInit
import com.dh.comn.comn.ModuleInit

/**
 * @author wjl
 */
class App : BaseApp() {
    override fun onCreate() {
        super.onCreate()
        //初始化模块
        LogUtils.i("sssssssssssssssssssddd"+ThreadUtils.isMainThread())
        ModuleInit.init()
    }
}