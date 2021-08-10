package com.derelicthut.basecode.mvvmkotlin

import com.derelicthut.basecode.base.BaseApp
import com.derelicthut.basecode.base.R
import com.derelicthut.basecode.base.utils.BaseUtils

/**
 * @author wjl
 */
class App : BaseApp() {
    override fun onCreate() {
        super.onCreate()
        //配置点击间隔
        BaseUtils.DEBOUNCING_DEFAULT_VALUE = 500
        //配置切图基准
        BaseUtils.SCREEN_MATCHER_WIDTH = 375f
        BaseUtils.SCREEN_MATCHER_HEIGHT = 667f
        //配置Nav动画
        BaseUtils.openEnterAnim = R.anim.anim_open_enter_right_to_middle
        BaseUtils.openExitAnim = R.anim.anim_open_exit_middle_to_left
        BaseUtils.closeEnterAnim = R.anim.anim_close_enter_left_to_middle
        BaseUtils.closeExitAnim = R.anim.anim_close_exit_middle_to_right
    }
}