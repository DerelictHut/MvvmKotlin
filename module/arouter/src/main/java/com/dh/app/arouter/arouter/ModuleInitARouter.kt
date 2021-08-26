package com.dh.app.arouter.arouter

import android.app.Application
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.facade.template.IRouteGroup
import com.dh.app.arouter.ui.activity.DynamicRouteRegistrationActivity
import com.dh.base.utils.router.BaseActivityRouteGroup
import com.dh.base.utils.router.IModuleInit
import com.dh.comn.comn.ComnRouterPath
import com.dh.comn.comn.ModuleInit


/**
 * @author wjl
 */
@Route(path = ModuleInit.MODULE_INIT_AROUTER)
class ModuleInitARouter : IModuleInit {
    override fun onCreate(app: Application, isMainProcess: Boolean) {

    }

    override fun getRouteGroup(): IRouteGroup? {
        return object : BaseActivityRouteGroup(ComnRouterPath.ARouter.GROUP_ACTIVITY) {

            override fun getInitData(): MutableList<Triple<String, Class<*>, Int>> {
                return mutableListOf(
                    Triple(ComnRouterPath.ARouter.AROUTER_DYNAMIC_ROUTE_REGISTRATION_ACTIVITY,
                        DynamicRouteRegistrationActivity::class.java, 0))
            }
        }
    }
}