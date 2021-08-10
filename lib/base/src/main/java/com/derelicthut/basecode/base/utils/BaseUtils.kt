package com.derelicthut.basecode.base.utils

import com.derelicthut.basecode.base.R

/**
 * @author wjl
 */
object BaseUtils {
    @JvmField
    var DEBOUNCING_DEFAULT_VALUE = 1000L

    @JvmField
    var openEnterAnim = R.anim.anim_open_enter_right_to_middle

    @JvmField
    var openExitAnim = R.anim.anim_open_exit_middle_to_left

    @JvmField
    var closeEnterAnim = R.anim.anim_close_enter_left_to_middle

    @JvmField
    var closeExitAnim = R.anim.anim_close_exit_middle_to_right

    /**
     * 基准切图宽
     */
    @JvmField
    var SCREEN_MATCHER_WIDTH = 375f

    /**
     * 基准切图高
     */
    @JvmField
    var SCREEN_MATCHER_HEIGHT = 667f
}