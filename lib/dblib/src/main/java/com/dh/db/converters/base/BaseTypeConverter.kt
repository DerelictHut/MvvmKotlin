package com.dh.db.converters.base

import androidx.room.TypeConverter
import com.google.gson.Gson

/**
 * @author wjl
 */
abstract class BaseTypeConverter<Src, Dst> {
    protected val mGson: Gson by lazy { Gson() }

    @TypeConverter
    fun revertData(dst: Dst?): Src? {
        return dst?.let { dst2Src(it) }
    }

    @TypeConverter
    fun converterData(src: Src?): Dst? {
        return src?.let { src2Dst(it) }
    }

    abstract fun dst2Src(dst: Dst): Src?

    abstract fun src2Dst(src: Src): Dst?
}