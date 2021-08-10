package com.derelicthut.basecode.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.annotation.NavigationRes
import com.derelicthut.basecode.base.extension.getNavHostFragment
import com.derelicthut.basecode.base.extension.getNavSwitcher
import com.derelicthut.basecode.base.utils.BASE_KEY_BUNDLE
import com.derelicthut.basecode.base.utils.NavSwitcher
import com.derelicthut.basecode.base.utils.START_DEST_ID

/**
 * @author wjl
 */
abstract class BaseNavActivity : BaseActivity() {
    protected lateinit var mNavSwitcher: NavSwitcher

    @NavigationRes
    protected abstract fun getNavId(): Int

    @LayoutRes
    protected open fun getNavHostId(): Int = R.layout.base_nav_host

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getNavHostId())
        val bundle = intent.getBundleExtra(BASE_KEY_BUNDLE)
        val fragmentId = intent.getIntExtra(START_DEST_ID, -1)
        mNavSwitcher = getNavSwitcher(R.id.nav_host_fragment_id)
        mNavSwitcher.setGraph(fragmentId, getNavId(), bundle)
    }

    override fun onSupportNavigateUp(): Boolean {
        return getNavHostFragment()?.getNavSwitcher()?.navigateUp() ?: false
    }
}