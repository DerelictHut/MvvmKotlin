package com.dh.app.nav

import com.dh.app.R
import com.dh.base.BaseNavActivity

/**
 * @author wjl
 */
class TestNavActivity : BaseNavActivity() {

    override fun getNavId(): Int = R.navigation.nav_graph

    override fun getNavHostId(): Int = R.layout.activity_test_nav
}