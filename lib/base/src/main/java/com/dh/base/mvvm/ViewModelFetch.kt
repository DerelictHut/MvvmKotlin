package com.dh.base.mvvm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner

/**
 * @author wjl
 */
object ViewModelFetch {
    operator fun <VM : ViewModel> get(owner: ViewModelStoreOwner, clazz: Class<VM>): VM {
        return ViewModelProvider(owner).get(clazz)
    }
}