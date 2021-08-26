package com.dh.base.utils.router

import android.content.Context
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.facade.service.SerializationService
import com.google.gson.Gson
import java.lang.reflect.Type

/**
 * @author wjl
 */
const val DH_AROUTER_JSON_SERVICE_PATH = "/base/utils/router/DhJsonServiceImpl"

@Route(path = DH_AROUTER_JSON_SERVICE_PATH)
class DhJsonServiceImpl : SerializationService {
  private val mGson: Gson by lazy { Gson() }

  override fun <T : Any> json2Object(input: String?, clazz: Class<T>): T? {
    return mGson.fromJson(input, clazz)
  }

  override fun init(context: Context?) {

  }

  override fun object2Json(instance: Any?): String? {
    return mGson.toJson(instance)
  }

  override fun <T : Any> parseObject(input: String, clazz: Type): T? {
    return mGson.fromJson(input, clazz)
  }
}