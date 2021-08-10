package com.derelicthut.basecode.base.utils

import android.net.Uri
import android.os.Bundle
import androidx.annotation.IdRes
import androidx.annotation.NavigationRes
import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.NavOptions
import androidx.navigation.Navigator
import com.blankj.utilcode.util.ActivityUtils
import com.derelicthut.basecode.base.R
import com.derelicthut.basecode.base.extension.dhCatch
import com.derelicthut.basecode.base.extension.getNavSwitcher

/**
 * @author wjl
 */
class NavSwitcher(private val mController: NavController?) {
    fun setGraph(@NavigationRes graphResId: Int) {
        setGraph(graphResId, null)
    }

    fun setGraph(@NavigationRes graphResId: Int, bundle: Bundle?) {
        setGraph(-1, graphResId, bundle)
    }

    fun setGraph(@IdRes startDestId: Int, @NavigationRes graphResId: Int, bundle: Bundle?) {
        mController?.apply {
            if (graphResId != 0) {
                if (startDestId == -1) {
                    setGraph(graphResId, bundle)
                } else {
                    val navGraph: NavGraph = navInflater.inflate(graphResId)
                    navGraph.startDestination = startDestId
                    setGraph(navGraph, bundle)
                }
            }
        }
    }

    private fun check(controller: NavController?, actionId: Int): Boolean {
        return controller?.let {
            it.currentDestination?.run {
                getAction(actionId)?.let {
                    true
                }
            }
        } ?: false
    }

    fun navigate(@IdRes resId: Int) {
        navigate(resId, null)
    }

    fun navigate(@IdRes resId: Int, args: Bundle?) {
        navigate(resId, args, null)
    }

    fun navigate(@IdRes resId: Int, args: Bundle?, navOptions: NavOptions?) {
        navigate(resId, args, navOptions, null)
    }

    fun navigate(@IdRes resId: Int,
                 args: Bundle?,
                 navOptions: NavOptions?,
                 navigatorExtras: Navigator.Extras?) {
        if (check(mController, resId)) {
            mController?.apply { navigate(resId, args, navOptions, navigatorExtras) }
        }
    }

    fun navigate(deepLink: Uri) {
        navigate(deepLink, null)
    }

    fun navigate(deepLink: Uri, navOptions: NavOptions?) {
        navigate(deepLink, navOptions, null)
    }

    fun navigate(deepLink: Uri, navOptions: NavOptions?, navigatorExtras: Navigator.Extras?) {
        dhCatch {
            mController?.apply { navigate(deepLink, navOptions, navigatorExtras) }
        }
    }

    fun navigateUp(): Boolean {
        return mController?.run { navigateUp() } ?: false
    }

    fun popBackStack(@IdRes destinationId: Int, inclusive: Boolean): Boolean {
        return mController?.run { popBackStack(destinationId, inclusive) } ?: false
    }

    fun getAnimNavBuilder(): NavOptions.Builder {
        return NavOptions.Builder().setEnterAnim(R.anim.anim_open_enter_right_to_middle)
            .setExitAnim(R.anim.anim_open_exit_middle_to_left)
            .setPopEnterAnim(R.anim.anim_close_enter_left_to_middle)
            .setPopExitAnim(R.anim.anim_close_exit_middle_to_right)
    }

    fun getAnimNavBuilder(@IdRes destinationId: Int, inclusive: Boolean): NavOptions.Builder? {
        return getAnimNavBuilder().setPopUpTo(destinationId, inclusive)
    }

    fun switchByDeepLink(deepLink: String?) {
        switchByDeepLink(deepLink, getAnimNavBuilder().build())
    }

    fun switchByDeepLink(deepLink: String?, options: NavOptions?) {
        dhCatch {
            ActivityUtils.getTopActivity()?.run {
                getNavSwitcher(R.id.nav_host_fragment_id).navigate(Uri.parse(deepLink), options)
            }
        }
    }
}