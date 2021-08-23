package com.dh.base.extension

import androidx.fragment.app.Fragment

/**
 * @author wjl
 */

fun Fragment.finishActivity(){
    activity?.apply { finish() }
}