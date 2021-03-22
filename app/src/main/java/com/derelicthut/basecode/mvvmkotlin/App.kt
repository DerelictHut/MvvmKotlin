package com.derelicthut.basecode.mvvmkotlin

import com.derelicthut.basecode.base.BaseApp
import com.derelicthut.basecode.base.utils.DEBOUNCING_DEFAULT_VALUE

/**
 * @author wjl
 */
class App : BaseApp() {
    override fun onCreate() {
        super.onCreate()
        DEBOUNCING_DEFAULT_VALUE = 500
    }
}