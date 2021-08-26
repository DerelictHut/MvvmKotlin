package com.dh.db.router

import android.app.Application
import android.content.Context
import com.alibaba.android.arouter.facade.annotation.Route
import com.dh.base.utils.router.IModuleInit

/**
 * @author wjl
 */
const val MODULE_INIT_DB = "/db/router/ModuleInitDb"

@Route(path = MODULE_INIT_DB)
class ModuleInitDb : IModuleInit {
    override fun onCreate(app: Application, isMainProcess: Boolean) {

    }
}