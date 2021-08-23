package com.dh.base.extension

import android.view.View
import com.blankj.utilcode.util.ClickUtils

/**
 * @author wjl
 */
@JvmOverloads
fun View.setOnDebouncingClickListener(duration: Long = 1000, listener: (v: View) -> Unit) {
    ClickUtils.applyGlobalDebouncing(this, duration, listener)
}
