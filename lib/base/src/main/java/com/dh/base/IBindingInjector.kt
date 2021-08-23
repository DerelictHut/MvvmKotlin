package com.dh.base

import androidx.annotation.LayoutRes
import androidx.databinding.ViewDataBinding

/**
 * @author wjl
 */
interface IBindingInjector<VDB : ViewDataBinding> {
    /**
     * 绑定的layout
     */
    @LayoutRes
    fun layoutId(): Int

    fun setBinding(binding: VDB)
}