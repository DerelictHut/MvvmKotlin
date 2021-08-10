package com.derelicthut.basecode.base

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.blankj.utilcode.util.BarUtils
import com.derelicthut.basecode.base.utils.ActivityHook
import com.derelicthut.basecode.base.utils.ScreenMatcher

/**
 * @author wjl
 */
abstract class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        handleActivityOrientation()
        super.onCreate(savedInstanceState)
        ScreenMatcher.fix()
        setStatusBar()
    }

    protected open fun handleActivityOrientation() {
        ActivityHook.hookOrientation(this)
    }

    protected open fun setStatusBar() {
        //设置状态栏透明
        BarUtils.setStatusBarColor(this, Color.TRANSPARENT)
        BarUtils.setStatusBarLightMode(this, true)
    }
}
