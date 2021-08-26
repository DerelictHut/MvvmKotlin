package com.dh.base.utils.router

import android.app.Application
import android.content.Context
import com.alibaba.android.arouter.facade.template.IProvider
import com.alibaba.android.arouter.facade.template.IRouteGroup
import com.blankj.utilcode.util.ThreadUtils

/**
 * @author wjl
 * 模块初始化注册
 */
interface IModuleInit : IProvider {
    fun onCreate(app: Application, isMainProcess: Boolean)

    fun getRouteGroup(): IRouteGroup? {
        return null
    }

    override fun init(context: Context?) {
        onCreate(context as Application, ThreadUtils.isMainThread())
        getRouteGroup()?.let { DhRouter.addRouteGroup(it) }

    }
}