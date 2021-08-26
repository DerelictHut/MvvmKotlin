package com.dh.app.router

import android.app.Application
import android.content.Context
import com.alibaba.android.arouter.facade.annotation.Route
import com.dh.base.R
import com.dh.base.utils.BaseUtils
import com.dh.base.utils.router.IModuleInit
import com.dh.comn.comn.ModuleInit

/**
 * @author wjl
 */
@Route(path = ModuleInit.MODULE_INIT_APP)
class ModuleInitApp : IModuleInit {
    override fun onCreate(app: Application, isMainProcess: Boolean) {
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