package com.dh.arouter.arouter

import android.content.Context
import android.net.Uri
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.facade.service.PathReplaceService
import com.dh.comn.comn.ComnRouterPath

/**
 * @author wjl
 * 在ARouter#build时调用，优先级高
 */
@Route(path = ComnRouterPath.ARouter.AROUTER_PATH_REPLACE_SERVICE_IMPL)
class DhPathReplaceServiceImpl : PathReplaceService {
    override fun forString(path: String): String {
        if(ComnRouterPath.ARouter.AROUTER_WITH_PARAM_ACTIVITY == path) {
            if(Math.random() > 0.95) {
                return ComnRouterPath.ARouter.AROUTER_PATH_REPLACE_SERVICE_ACTIVITY
            }
        }
        return path
    }

    override fun forUri(uri: Uri): Uri {
        return uri
    }

    override fun init(context: Context?) {

    }

}