package com.derelicthut.basecode.base.utils

import android.view.View
import com.blankj.utilcode.util.ClickUtils

/**
 * @author wjl
 */
var DEBOUNCING_DEFAULT_VALUE = 1000L

@JvmOverloads
fun View.setOnDebouncingClickListener(duration: Long = 1000, listener: (v: View) -> Unit) {
    ClickUtils.applyGlobalDebouncing(this, duration, listener)
}