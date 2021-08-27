package com.dh.app.arouter.ui.activity

import android.annotation.SuppressLint
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.callback.NavigationCallback
import com.blankj.utilcode.util.BarUtils
import com.blankj.utilcode.util.LogUtils
import com.blankj.utilcode.util.ToastUtils
import com.dh.app.arouter.R
import com.dh.app.arouter.databinding.ActivityArouterBinding
import com.dh.base.BindingActivity
import com.dh.base.utils.ResUtils
import com.dh.base.utils.router.DhRouter
import com.dh.comn.comn.ComnRouterPath

/**
 * @author wjl
 */
class ARouterActivity : BindingActivity<ActivityArouterBinding>() {
    override fun layoutId(): Int = R.layout.activity_arouter

    @SuppressLint("SetTextI18n")
    override fun initVariable() {
        BarUtils.addMarginTopEqualStatusBarHeight(mBinding.tvGoToWithParamActivity)
        with(mBinding.dynamicRouteRegistration) {
            text = ResUtils.getString(R.string.dynamic_route_registration) + ResUtils.getString(R.string.unrealized)
        }
    }

    override fun initListener() {
        mBinding.tvGoToWithParamActivity.setOnClickListener {
            val mutableMap = mutableMapOf(
                Pair("张三", "男"), Pair("李四", "男"), Pair("王二麻子", "男"))
            DhRouter.path(ComnRouterPath.ARouter.AROUTER_WITH_PARAM_ACTIVITY)
                .withString(NICKNAME, "小明")
                .withString("mSex", "男")
                .withString(ID_CARD, "230181190012250801")
                .withParcelable(PARCELABLE_BEAN, ParcelableBean("Parcelable Value"))
                .withObject(MAP_STR, mutableMap)
                .withObject(NORMAL_BEAN, NormalEntity("entity Value"))
                .navigation(this, mNavigationCallback)
        }
        mBinding.dynamicRouteRegistration.setOnClickListener {
            DhRouter.nav(ComnRouterPath.ARouter.AROUTER_DYNAMIC_ROUTE_REGISTRATION_ACTIVITY)
        }
        mBinding.degradeService.setOnClickListener {
            DhRouter.nav(ComnRouterPath.INVALID_PATH)
        }
    }

    private val mNavigationCallback = object : NavigationCallback {
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
    }
}