package com.dh.net.router

import android.app.Application
import android.content.Context
import com.alibaba.android.arouter.facade.annotation.Route
import com.dh.base.utils.router.IModuleInit

/**
 * @author wjl
 */
const val MODULE_INIT_NET = "/net/router/ModuleInitNet"

@Route(path = MODULE_INIT_NET)
class ModuleInitNet : IModuleInit {
    override fun onCreate(app: Application, isMainProcess: Boolean) {

    }
}