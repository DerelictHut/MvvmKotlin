package com.dh.room.router

import android.app.Application
import com.alibaba.android.arouter.facade.annotation.Route
import com.dh.base.utils.router.IModuleInit
import com.dh.comn.comn.ModuleInit

/**
 * @author wjl
 */
@Route(path = ModuleInit.MODULE_INIT_ROOM)
class ModuleInitRoom : IModuleInit {
    override fun onCreate(app: Application, isMainProcess: Boolean) {

    }
}