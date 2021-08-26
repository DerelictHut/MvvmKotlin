package com.dh.login.router

import android.app.Application
import android.content.Context
import com.alibaba.android.arouter.facade.annotation.Route
import com.dh.base.utils.router.IModuleInit
import com.dh.comn.comn.ModuleInit

/**
 * @author wjl
 */
@Route(path = ModuleInit.MODULE_INIT_LOGIN)
class ModuleInitLogin : IModuleInit {
    override fun onCreate(app: Application, isMainProcess: Boolean) {

    }
}