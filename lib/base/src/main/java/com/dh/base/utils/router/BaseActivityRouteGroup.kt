package com.dh.base.utils.router

import com.alibaba.android.arouter.facade.enums.RouteType
import com.alibaba.android.arouter.facade.model.RouteMeta
import com.alibaba.android.arouter.facade.template.IRouteGroup

/**
 * @author wjl
 */
abstract class BaseActivityRouteGroup(private val groupName: String) : IRouteGroup {
    override fun loadInto(atlas: MutableMap<String, RouteMeta>) {
        getInitData().forEach {
            atlas[it.first] = RouteMeta.build(
                RouteType.ACTIVITY,
                it.second,
                it.first,
                groupName,
                0, it.third)
        }
    }

    abstract fun getInitData(): MutableList<Triple<String, Class<*>, Int>>
}