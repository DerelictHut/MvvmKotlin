package com.derelicthut.basecode.base.utils

import android.annotation.SuppressLint
import android.app.Activity
import android.content.pm.ActivityInfo
import android.content.res.TypedArray
import android.os.Build

/**
 * @author wjl
 */
object ActivityHook {

    /**
     * java.lang.IllegalStateException: Only fullscreen opaque activities can request orientation
     *
     *
     * 修复android 8.0存在的问题
     *
     *
     * 在Activity中onCreate()中super之前调用
     *
     * @param activity
     */
    @JvmStatic
    fun hookOrientation(activity: Activity) {
        //目标版本8.0
        if (activity.applicationInfo.targetSdkVersion == Build.VERSION_CODES.O) {
            if (isTranslucentOrFloating(activity)) {
                fixOrientation(activity)
            }
        }
    }

    /**
     * 设置屏幕不固定，绕过检查
     *
     * @param activity
     */
    private fun fixOrientation(activity: Activity) {
        try {
            val activityClass = Activity::class.java
            val mActivityInfoField = activityClass.getDeclaredField("mActivityInfo")
            mActivityInfoField.isAccessible = true
            val activityInfo = mActivityInfoField[activity] as ActivityInfo
            //设置屏幕不固定
            activityInfo.screenOrientation = ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    /**
     * 检查屏幕 横竖屏或者锁定就是固定
     *
     * @param activity
     * @return
     */
    @SuppressLint("PrivateApi", "DiscouragedPrivateApi")
    private fun isTranslucentOrFloating(activity: Activity): Boolean {
        var isTranslucentOrFloating = false
        try {
            val styleableClass = Class.forName("com.android.internal.R\$styleable")
            val windowField = styleableClass.getDeclaredField("Window")
            windowField.isAccessible = true
            val styleableRes = windowField[null] as IntArray
            //先获取到TypedArray
            val typedArray = activity.obtainStyledAttributes(styleableRes)
            val activityInfoClass: Class<*> = ActivityInfo::class.java
            //调用检查是否屏幕旋转
            val isTranslucentOrFloatingMethod = activityInfoClass.getDeclaredMethod("isTranslucentOrFloating",
                TypedArray::class.java)
            isTranslucentOrFloatingMethod.isAccessible = true
            isTranslucentOrFloating = isTranslucentOrFloatingMethod.invoke(null,
                typedArray) as Boolean
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return isTranslucentOrFloating
    }
}