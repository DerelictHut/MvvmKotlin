package com.dh.base.utils.router

import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.template.IProvider
import com.alibaba.android.arouter.facade.template.IRouteGroup
import com.alibaba.android.arouter.launcher.ARouter
import com.blankj.utilcode.util.ActivityUtils

/**
 * @author wjl
 * ARouter路由管理
 */
object DhRouter {
    fun nav(path: String): Any? {
        return path(path).nav()
    }

    fun path(path: String): Postcard {
        return getARouter().build(path)
    }

    fun <T : IProvider> binder(binderClass: Class<T>): T {
        return getARouter().navigation(binderClass)
    }

    fun inject(any: Any) {
        getARouter().inject(any)
    }

    fun addRouteGroup(iRouteGroup: IRouteGroup) {
        //1.5.2才开始提供，
    }

    private fun getARouter(): ARouter {
        return ARouter.getInstance()
    }
}

fun Postcard.nav(): Any? {
    return navigation(ActivityUtils.getTopActivity())
}