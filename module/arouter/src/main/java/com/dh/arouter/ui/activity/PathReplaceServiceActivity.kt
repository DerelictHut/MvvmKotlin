package com.dh.arouter.ui.activity

import com.alibaba.android.arouter.facade.annotation.Route
import com.dh.arouter.R
import com.dh.base.utils.ResUtils
import com.dh.comn.comn.ComnRouterPath
import com.dh.comn.ui.activity.BaseResultOfDisplayActivity

/**
 * @author wjl
 * 路由替换页面
 */
@Route(path = ComnRouterPath.ARouter.AROUTER_PATH_REPLACE_SERVICE_ACTIVITY)
class PathReplaceServiceActivity : BaseResultOfDisplayActivity() {

    override fun initVariable() {
        mBinding.tvShow.text = ResUtils.getString(R.string.path_replace_service)
    }

    override fun initListener() {

    }
}
