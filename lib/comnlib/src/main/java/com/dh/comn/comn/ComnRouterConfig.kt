package com.dh.comn.comn

import com.alibaba.android.arouter.facade.Postcard
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
    private const val ACTIVITY_PATH = "ui/activity/"

    object Login {
        private const val GROUP = "/login/$ACTIVITY_PATH"
        const val LOGIN_LOGIN_ACTIVITY = "${GROUP}LoginActivity"
    }

    object Setting {
        private const val GROUP = "/setting/$ACTIVITY_PATH"
        const val SETTING_REAL_NAME_ACTIVITY = "${GROUP}RealNameActivity"
    }

    object ARouter {
        private const val GROUP = "/dh_arouter/$ACTIVITY_PATH"
        const val AROUTER_WITH_PARAM_ACTIVITY = "${GROUP}WithParamActivity"
    }
}

/**
 * 页面是否需要拦截条件
 */
object ComnRouterInterceptConfig {
    //登录拦截
    const val INTERCEPT_LOGIN = 1

    //实名拦截
    const val INTERCEPT_REAL_NAME = 1 shl 1
}

fun Postcard.interceptParse(condition: Int): Boolean {
    return extra and condition == condition
}