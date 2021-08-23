package com.dh.base.mvvm

import android.os.Looper
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer

/**
 * @author wjl
 */
class SafeMutableLiveData<T> : MutableLiveData<T> {
    constructor(value: T) : super(value) {}
    constructor() {}

    override fun observe(owner: LifecycleOwner, observer: Observer<in T>) {
        removeObserver(observer)
        super.observe(owner, observer)
    }

    override fun observeForever(observer: Observer<in T>) {
        removeObserver(observer)
        super.observeForever(observer)
    }

    fun updateValue(value: T): Boolean {
        return if (Looper.getMainLooper() == Looper.myLooper()) {
            setValue(value)
            true
        } else {
            postValue(value)
            false
        }
    }

    companion object {
        fun <T> create(value: T?): SafeMutableLiveData<T> {
            return value?.let { SafeMutableLiveData(it) } ?: SafeMutableLiveData()
        }
    }
}