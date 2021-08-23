package com.dh.setting.router

import android.app.Application
import android.content.Context
import com.alibaba.android.arouter.facade.annotation.Route
import com.dh.base.utils.router.IModuleInit
import com.dh.comn.comn.ModuleInit

/**
 * @author wjl
 */
@Route(path = ModuleInit.MODULE_INIT_SETTING)
class ModuleInitSetting : IModuleInit {
    override fun onCreate(app: Application, isMainProcess: Boolean) {

    }

    override fun init(context: Context?) {

    }
}