package com.derelicthut.basecode.base.extension

import android.app.Activity
import android.view.View
import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import com.derelicthut.basecode.base.BaseNavActivity
import com.derelicthut.basecode.base.R
import com.derelicthut.basecode.base.utils.NavSwitcher

/**
 * @author wjl
 */
fun BaseNavActivity.getNavHostFragment(): Fragment? {
    return this.supportFragmentManager.findFragmentById(R.id.nav_host_fragment_id)
}

fun Activity.getNavSwitcher(@IdRes viewId: Int): NavSwitcher =
    NavSwitcher(dhCatch { Navigation.findNavController(this, viewId) })

fun Fragment.getNavSwitcher(): NavSwitcher =
    NavSwitcher(dhCatch { NavHostFragment.findNavController(this) })

fun View.getNavSwitcher(): NavSwitcher = NavSwitcher(dhCatch { Navigation.findNavController(this) })
