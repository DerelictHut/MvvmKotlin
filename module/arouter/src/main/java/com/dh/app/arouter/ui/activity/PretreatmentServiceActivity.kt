package com.dh.app.arouter.ui.activity

import com.alibaba.android.arouter.facade.annotation.Route
import com.dh.app.arouter.R
import com.dh.base.utils.ResUtils
import com.dh.comn.comn.ComnRouterPath
import com.dh.comn.ui.activity.BaseResultOfDisplayActivity

/**
 * @author wjl
 */
@Route(path = ComnRouterPath.ARouter.AROUTER_PRETREATMENT_SERVICE_ACTIVITY)
class PretreatmentServiceActivity : BaseResultOfDisplayActivity() {

    override fun initVariable() {
        mBinding.tvShow.text = ResUtils.getString(R.string.pretreatment_service)
    }

    override fun initListener() {

    }
}