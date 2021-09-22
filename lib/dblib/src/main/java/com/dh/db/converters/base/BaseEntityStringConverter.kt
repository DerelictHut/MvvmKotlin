package com.dh.db.converters.base

/**
 * @author wjl
 */
abstract class BaseEntityStringConverter<Src> : BaseTypeConverter<Src, String>() {
    override fun src2Dst(src: Src): String? = mGson.toJson(src)
}