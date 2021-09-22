package com.dh.db.converters

import com.dh.db.converters.base.BaseTypeConverter
import java.util.*

/**
 * @author wjl
 */
class DateConverter : BaseTypeConverter<Date, Long>() {
    override fun dst2Src(dst: Long): Date? {
        return Date(dst)
    }

    override fun src2Dst(src: Date): Long? {
        return src.time
    }
}