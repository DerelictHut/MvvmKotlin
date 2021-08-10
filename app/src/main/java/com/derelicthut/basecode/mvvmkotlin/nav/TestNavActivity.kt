package com.derelicthut.basecode.mvvmkotlin.nav

import com.derelicthut.basecode.base.BaseNavActivity
import com.derelicthut.basecode.mvvmkotlin.R

/**
 * @author wjl
 */
class TestNavActivity : BaseNavActivity() {

    override fun getNavId(): Int = R.navigation.nav_graph

    override fun getNavHostId(): Int = R.layout.activity_test_nav
}