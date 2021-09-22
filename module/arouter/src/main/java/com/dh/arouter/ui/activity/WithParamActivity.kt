package com.dh.arouter.ui.activity

import android.annotation.SuppressLint
import android.os.Parcelable
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.blankj.utilcode.util.BarUtils
import com.dh.arouter.R
import com.dh.arouter.databinding.ActivityWithParamBinding
import com.dh.base.BindingActivity
import com.dh.base.utils.router.DhRouter
import com.dh.comn.comn.ComnRouterInterceptConfig
import com.dh.comn.comn.ComnRouterPath
import kotlinx.android.parcel.Parcelize

/**
 * @author wjl
 * 携带参数
 */
private const val extras = ComnRouterInterceptConfig.INTERCEPT_LOGIN or ComnRouterInterceptConfig.INTERCEPT_REAL_NAME
const val NICKNAME = "nickname"
const val ID_CARD = "idCard"
const val PARCELABLE_BEAN = "parcelableBean"
const val MAP_STR = "mapStr"
const val NORMAL_BEAN = "normalBean"

@Route(path = ComnRouterPath.ARouter.AROUTER_WITH_PARAM_ACTIVITY, extras = extras)
class WithParamActivity : BindingActivity<ActivityWithParamBinding>() {
  @Autowired(name = NICKNAME, required = true, desc = "昵称")
  lateinit var mNickname: String

  @Autowired(required = true)
  lateinit var mSex: String

  @JvmField
  @Autowired(name = ID_CARD, desc = "身份证号")
  var mIdCard: String? = null

  @JvmField
  @Autowired(name = PARCELABLE_BEAN)
  var mParcelableBean: ParcelableBean? = null

  @Autowired(name = MAP_STR, required = true)
  lateinit var mMap: MutableMap<String, String>

  @Autowired(name = NORMAL_BEAN, required = true)
  lateinit var mNormalEntity: NormalEntity

  override fun layoutId(): Int = R.layout.activity_with_param

  @SuppressLint("SetTextI18n")
  override fun initVariable() {
    BarUtils.addMarginTopEqualStatusBarHeight(mBinding.tvParam)
    DhRouter.inject(this)
    with(mBinding.tvParam) {
      text = "昵称：$mNickname\n性别：$mSex\n身份证：${mIdCard ?: "保密"}" +
             "\nParcelable自动注入参数：${mParcelableBean?.desc ?: "null"}" +
             "\nMap自动注入参数：${mMap}\nBean自动注入：${mNormalEntity.desc}"
    }
  }

  override fun initListener() {

  }
}

@Parcelize
data class ParcelableBean(val desc: String) : Parcelable

data class NormalEntity(val desc: String)

