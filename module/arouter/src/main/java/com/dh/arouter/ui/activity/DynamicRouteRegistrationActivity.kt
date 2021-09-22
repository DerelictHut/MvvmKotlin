package com.dh.arouter.ui.activity

import com.dh.arouter.R
import com.dh.base.utils.ResUtils
import com.dh.comn.ui.activity.BaseResultOfDisplayActivity

/**
 * @author wjl
 * 动态路由注册页面
 */
class DynamicRouteRegistrationActivity : BaseResultOfDisplayActivity() {

  override fun initVariable() {
    mBinding.tvShow.text = ResUtils.getString(R.string.dynamic_route_registration)
  }

  override fun initListener() {

  }
}