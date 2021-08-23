package com.dh.base.utils

/**
 * @author wjl
 */
object FastUtil {
    private var lastClickTime: Long = 0
    private var currentId = 0

    fun isFastClick(viewId: Int): Boolean {
        return isFastClick(viewId, BaseUtils.DEBOUNCING_DEFAULT_VALUE)
    }

    fun isFastClick(viewId: Int, millis: Long): Boolean {
        if (currentId != viewId) {
            currentId = viewId
            lastClickTime = System.currentTimeMillis()
        } else {
            val time = System.currentTimeMillis()
            if (time - lastClickTime < millis) {
                lastClickTime = time
                return true
            }
            lastClickTime = time
        }
        return false
    }
}