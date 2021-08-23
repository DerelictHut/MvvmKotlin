package com.dh.base.utils.router

import android.app.Application
import com.alibaba.android.arouter.facade.template.IProvider

/**
 * @author wjl
 * 模块初始化注册
 */
interface IModuleInit : IProvider {
    fun onCreate(app: Application, isMainProcess: Boolean)
}