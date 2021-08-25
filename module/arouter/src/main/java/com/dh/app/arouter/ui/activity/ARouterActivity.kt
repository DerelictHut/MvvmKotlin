package com.dh.app.arouter.ui.activity

import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.callback.NavigationCallback
import com.blankj.utilcode.util.BarUtils
import com.blankj.utilcode.util.LogUtils
import com.blankj.utilcode.util.ToastUtils
import com.dh.app.arouter.R
import com.dh.app.arouter.databinding.ActivityArouterBinding
import com.dh.base.BindingActivity
import com.dh.base.utils.router.DhRouter
import com.dh.comn.comn.ComnRouterPath

/**
 * @author wjl
 */
class ARouterActivity : BindingActivity<ActivityArouterBinding>() {
    override fun layoutId(): Int = R.layout.activity_arouter

    override fun initVariable() {
        BarUtils.addMarginTopEqualStatusBarHeight(mBinding.tvGoToWithParamActivity)
    }

    override fun initListener() {
        mBinding.tvGoToWithParamActivity.setOnClickListener {
            DhRouter.path(ComnRouterPath.ARouter.AROUTER_WITH_PARAM_ACTIVITY)
                .withString(NICKNAME, "小明").withString(ID_CARD, "230181190012250801")
                .navigation(this, object : NavigationCallback {
                    override fun onLost(postcard: Postcard) {
                        LogUtils.i("未发现路由")
                    }

                    override fun onFound(postcard: Postcard) {
                        LogUtils.i("找到路由")
                    }

                    override fun onInterrupt(postcard: Postcard) {
                        LogUtils.i("被拦截 = $postcard")
                        ToastUtils.showLong(postcard.tag.toString())
                    }

                    override fun onArrival(postcard: Postcard) {
                        LogUtils.i("跳转成功")
                    }
                })
        }
    }

}