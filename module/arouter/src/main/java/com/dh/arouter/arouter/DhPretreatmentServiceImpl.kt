package com.dh.arouter.arouter

import android.content.Context
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.facade.service.PretreatmentService
import com.dh.base.utils.router.DhRouter
import com.dh.comn.comn.ComnRouterPath

/**
 * @author wjl
 * 在ARouter#navigation时调用，跳转预处理
 */
@Route(path = ComnRouterPath.ARouter.AROUTER_PRETREATMENT_SERVICE_IMPL)
class DhPretreatmentServiceImpl : PretreatmentService {
    override fun onPretreatment(context: Context?, postcard: Postcard): Boolean {
        if(ComnRouterPath.ARouter.AROUTER_WITH_PARAM_ACTIVITY == postcard.path) {
            if(Math.random() > 0.95) {
                DhRouter.nav(ComnRouterPath.ARouter.AROUTER_PRETREATMENT_SERVICE_ACTIVITY)
                return false
            }
        }
        //返回false用户进行处理
        return true
    }

    override fun init(context: Context?) {

    }
}