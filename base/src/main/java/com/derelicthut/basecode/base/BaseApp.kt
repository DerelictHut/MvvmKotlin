package com.derelicthut.basecode.base

import android.app.Application
import com.blankj.utilcode.util.Utils
import com.derelicthut.basecode.base.utils.ScreenMatcher

/**
 * @author wjl
 */
open class BaseApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Utils.init(this)
        ScreenMatcher.fix()
    }
}