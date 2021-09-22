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
    const val MODULE_INIT_AROUTER = "/dhArouter/router/ModuleInitARouter"

    fun init() {
        //需要初始化的module集合
        DhRouter.nav(MODULE_INIT_APP)
        DhRouter.nav(MODULE_INIT_COMN)
        DhRouter.nav(MODULE_INIT_DB)
        DhRouter.nav(MODULE_INIT_NET)
        DhRouter.nav(MODULE_INIT_LOGIN)
        DhRouter.nav(MODULE_INIT_SETTING)
        DhRouter.nav(MODULE_INIT_AROUTER)
    }
}

/**
 * 模块名+类名
 */
object ComnRouterPath {
    private const val ACTIVITY_PATH = "ui/activity/"
    private const val FRAGMENT_PATH = "ui/fragment/"

    //无效路径
    const val INVALID_PATH = "/error/invalid_path"

    object Login {
        const val GROUP_ACTIVITY = "/login/$ACTIVITY_PATH"
        const val LOGIN_LOGIN_ACTIVITY = "${GROUP_ACTIVITY}LoginActivity"
    }

    object Setting {
        const val GROUP_ACTIVITY = "/setting/$ACTIVITY_PATH"
        const val SETTING_REAL_NAME_ACTIVITY = "${GROUP_ACTIVITY}RealNameActivity"
    }

    object ARouter {
        const val GROUP = "/dh_arouter/"
        const val GROUP_ACTIVITY = "$GROUP$ACTIVITY_PATH"
        const val GROUP_FRAGMENT = "$GROUP$FRAGMENT_PATH"
        const val AROUTER_PATH_REPLACE_SERVICE_IMPL = "${GROUP}arouter/DhPathReplaceServiceImpl"
        const val AROUTER_PRETREATMENT_SERVICE_IMPL = "${GROUP}arouter/DhPretreatmentServiceImpl"
        const val AROUTER_DEGRADE_SERVICE_IMPL = "${GROUP}arouter/DhDegradeServiceImpl"
        const val AROUTER_DEGRADE_SERVICE_ACTIVITY = "${GROUP_ACTIVITY}DegradeServiceActivity"
        const val AROUTER_PRETREATMENT_SERVICE_ACTIVITY = "${GROUP_ACTIVITY}PretreatmentServiceActivity"
        const val AROUTER_PATH_REPLACE_SERVICE_ACTIVITY = "${GROUP_ACTIVITY}PathReplaceServiceActivity"
        const val AROUTER_WITH_PARAM_ACTIVITY = "${GROUP_ACTIVITY}WithParamActivity"
        const val AROUTER_DYNAMIC_ROUTE_REGISTRATION_ACTIVITY = "${GROUP_ACTIVITY}DynamicRouteRegistrationActivity"
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