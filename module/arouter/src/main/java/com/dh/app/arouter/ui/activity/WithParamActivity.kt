package com.dh.app.arouter.ui.activity

import android.annotation.SuppressLint
import android.os.Parcelable
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.blankj.utilcode.util.BarUtils
import com.dh.app.arouter.R
import com.dh.app.arouter.databinding.ActivityWithParamBinding
import com.dh.base.BindingActivity
import com.dh.base.utils.router.DhRouter
import com.dh.comn.comn.ComnRouterInterceptConfig
import com.dh.comn.comn.ComnRouterPath

/**
 * @author wjl
 * 携带参数
 */
const val extras = ComnRouterInterceptConfig.INTERCEPT_LOGIN or ComnRouterInterceptConfig.INTERCEPT_REAL_NAME
const val NICKNAME = "nickname"
const val ID_CARD = "idCard"

@Route(path = ComnRouterPath.ARouter.AROUTER_WITH_PARAM_ACTIVITY, extras = extras)
class WithParamActivity : BindingActivity<ActivityWithParamBinding>() {
    @Autowired(name = NICKNAME, required = true, desc = "昵称")
    lateinit var mNickname: String

    @JvmField
    @Autowired(name = ID_CARD, desc = "身份证号")
    var mIdCard: String? = null

    override fun layoutId(): Int = R.layout.activity_with_param

    @SuppressLint("SetTextI18n")
    override fun initVariable() {
        BarUtils.addMarginTopEqualStatusBarHeight(mBinding.tvParam)
        DhRouter.inject(this)
        with(mBinding.tvParam) {
            text = "姓名：$mNickname\n身份证：${mIdCard ?: "保密"}"
        }
    }

    override fun initListener() {

    }
}

//data class Person(val name: String):Parcelable