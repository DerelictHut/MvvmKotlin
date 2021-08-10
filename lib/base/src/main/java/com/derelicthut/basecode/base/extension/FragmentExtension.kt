package com.derelicthut.basecode.base.extension

import androidx.annotation.IdRes
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.derelicthut.basecode.base.BindingFragment

/**
 * @author wjl
 */

fun Fragment.finishActivity(){
    activity?.apply { finish() }
}