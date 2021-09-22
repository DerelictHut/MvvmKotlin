package com.dh.db.converters.base

import com.google.gson.reflect.TypeToken

/**
 * @author wjl
 */
abstract class BaseListStringConverter<Src> : BaseEntityStringConverter<MutableList<Src>>() {

    override fun dst2Src(dst: String): MutableList<Src>? =
        mGson.fromJson(dst, object : TypeToken<MutableList<Src>>() {}.type)
}