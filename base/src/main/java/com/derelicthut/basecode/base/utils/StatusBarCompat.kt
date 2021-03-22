package com.derelicthut.basecode.base.utils

import android.os.Build
import android.view.View
import com.blankj.utilcode.util.BarUtils

/**
 * @author wjl
 */
object StatusBarCompat {
    private var statusBarHeight = BarUtils.getStatusBarHeight()

    @JvmStatic
    fun expendStatusBarHeight(view: View?) {
        view?.apply {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                post {
                    rootWindowInsets?.let { windowInsets ->
                        windowInsets.displayCutout?.let {
                            statusBarHeight = statusBarHeight.coerceAtLeast(it.safeInsetTop)
                        }
                    }
                    realExpand(view)
                }
            } else {
                realExpand(this)
            }
        }
    }

    @JvmStatic
    fun realExpand(view: View) {
        view.layoutParams?.apply {
            this.height = this.height + statusBarHeight
            view.setPadding(view.paddingLeft,
                view.paddingTop + statusBarHeight,
                view.paddingRight,
                view.paddingBottom)
        }
    }
}