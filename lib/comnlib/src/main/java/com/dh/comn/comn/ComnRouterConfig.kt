package com.dh.comn.comn

import com.dh.base.utils.router.DhRouter
import com.dh.db.router.MODULE_INIT_DB
import com.dh.net.router.MODULE_INIT_NET

/**
 * @author wjl
 */
object ModuleInit {
    const val MODULE_INIT_APP = "/app/router/ModuleInitApp"
    const val MODULE_INIT_COMN = "/comn/router/ModuleInitComn"
    const val MODULE_INIT_LOGIN = "/login/router/ModuleInitLogin"
    const val MODULE_INIT_SETTING = "/setting/router/ModuleInitSetting"

    //需要初始化的module集合
    val moduleInitList = mutableListOf(DhRouter.nav(MODULE_INIT_APP),
        DhRouter.nav(MODULE_INIT_COMN),
        DhRouter.nav(MODULE_INIT_DB),
        DhRouter.nav(MODULE_INIT_NET),
        DhRouter.nav(MODULE_INIT_LOGIN),
        DhRouter.nav(MODULE_INIT_SETTING))
}

/**
 * 模块名+类名
 */
object ComnRouterPath {
    const val LOGIN_LOGIN_ACTIVITY = "/login/LoginActivity"
}