package com.dh.base.mvvm

import androidx.lifecycle.ViewModel
import java.lang.NullPointerException
import java.util.concurrent.ConcurrentHashMap

/**
 * @author wjl
 */
open class BaseViewModel : ViewModel() {
    /**
     * 初始化集合(线程安全)
     */
    private val maps: MutableMap<String, SafeMutableLiveData<*>> by lazy {
        ConcurrentHashMap<String, SafeMutableLiveData<*>>()
    }

    /**
     * 通过指定的数据实体类获取对应的 LiveData 类
     */
    operator fun <T> get(clazz: Class<T>): SafeMutableLiveData<T>? {
        return get(null, clazz)
    }


    /**
     * 通过指定的key或者数据实体类获取对应的 LiveData 类
     */
    operator fun <T> get(key: String?, clazz: Class<T>): SafeMutableLiveData<T> {
        val keyName = if (key.isNullOrEmpty()) {
            clazz.canonicalName
        } else {
            key
        } ?: throw NullPointerException("key 不可为null")
        var unRepeatLiveData: SafeMutableLiveData<T>? = maps[keyName] as SafeMutableLiveData<T>?
        // 判断集合是否已经存在 LiveData 对象，若存在就返回
        if (unRepeatLiveData != null) {
            return unRepeatLiveData
        }
        // 如果 Map 集合中没有对应实体类的 LiveData 对象，就创建并添加至集合中
        unRepeatLiveData = SafeMutableLiveData()
        maps[keyName] = unRepeatLiveData
        return unRepeatLiveData
    }

    /**
     * 在对应的FragmentActivity销毁之后调用
     */
    override fun onCleared() {
        super.onCleared()
        maps.clear()
    }

}