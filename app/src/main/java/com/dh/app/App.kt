package com.dh.app

import com.dh.base.BaseApp
import com.dh.comn.comn.ModuleInit

/**
 * @author wjl
 */
class App : BaseApp() {
    override fun onCreate() {
        super.onCreate()
        //初始化模块
        ModuleInit.init()
    }
}