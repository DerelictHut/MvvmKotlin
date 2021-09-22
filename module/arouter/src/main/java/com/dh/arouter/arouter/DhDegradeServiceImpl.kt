package com.dh.arouter.arouter

import android.content.Context
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.facade.service.DegradeService
import com.dh.base.utils.router.DhRouter
import com.dh.comn.comn.ComnRouterPath
import com.dh.comn.comn.ComnRouterPath.ARouter.AROUTER_DEGRADE_SERVICE_IMPL

/**
 * @author wjl
 * 全局降级策略
 */
@Route(path = AROUTER_DEGRADE_SERVICE_IMPL)
class DhDegradeServiceImpl : DegradeService {
    override fun onLost(context: Context?, postcard: Postcard) {
        if(ComnRouterPath.INVALID_PATH == postcard.path) {
            DhRouter.nav(ComnRouterPath.ARouter.AROUTER_DEGRADE_SERVICE_ACTIVITY)
        }
    }

    override fun init(context: Context?) {

    }
}