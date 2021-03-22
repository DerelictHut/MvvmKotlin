package com.derelicthut.basecode.base.mvvm

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModel

/**
 * @author wjl
 */
fun <T : ViewModel> FragmentActivity.getVm(clazz: Class<T>): T = ViewModelFetch[this, clazz]

fun <T : ViewModel> Fragment.getVm(clazz: Class<T>): T = ViewModelFetch[this, clazz]

fun <T : ViewModel> Fragment.getActivityVm(clazz: Class<T>): T =
    ViewModelFetch[requireActivity(), clazz]