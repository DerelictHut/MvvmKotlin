package com.dh.comn.ui.activity

import com.dh.base.BindingActivity
import com.dh.comn.R
import com.dh.comn.databinding.ActivityBaseResultOfDisplayBinding

/**
 * @author wjl
 * 一些跳转的结果展示
 */
abstract class BaseResultOfDisplayActivity : BindingActivity<ActivityBaseResultOfDisplayBinding>() {
    override fun layoutId(): Int = R.layout.activity_base_result_of_display

    override fun initVariable() {

    }
}