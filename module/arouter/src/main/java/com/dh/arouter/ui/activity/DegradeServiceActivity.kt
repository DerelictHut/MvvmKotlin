package com.dh.arouter.ui.activity

import com.alibaba.android.arouter.facade.annotation.Route
import com.dh.arouter.R
import com.dh.base.utils.ResUtils
import com.dh.comn.comn.ComnRouterPath
import com.dh.comn.ui.activity.BaseResultOfDisplayActivity

/**
 * @author wjl
 */
@Route(path = ComnRouterPath.ARouter.AROUTER_DEGRADE_SERVICE_ACTIVITY)
class DegradeServiceActivity : BaseResultOfDisplayActivity() {
    override fun initVariable() {
        mBinding.tvShow.text = ResUtils.getString(R.string.degrade_service)
    }
}