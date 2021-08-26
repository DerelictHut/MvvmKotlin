package com.dh.app.arouter.ui.activity

import com.alibaba.android.arouter.facade.annotation.Route
import com.dh.app.arouter.R
import com.dh.app.arouter.databinding.ActivityPathReplaceServiceBinding
import com.dh.base.BindingActivity
import com.dh.comn.comn.ComnRouterPath

/**
 * @author wjl
 * 路由替换页面
 */
@Route(path = ComnRouterPath.ARouter.AROUTER_PATH_REPLACE_SERVICE_ACTIVITY)
class PathReplaceServiceActivity : BindingActivity<ActivityPathReplaceServiceBinding>() {
    override fun layoutId(): Int = R.layout.activity_path_replace_service

    override fun initVariable() {

    }

    override fun initListener() {

    }
}
