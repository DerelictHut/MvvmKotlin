package com.dh.db.converters

import com.dh.db.converters.base.BaseTypeConverter
import com.dh.db.sealeds.EducationBackgroundSealed

/**
 * @author wjl
 */
class EducationBackgroundConverter : BaseTypeConverter<EducationBackgroundSealed, Int>() {
    override fun dst2Src(dst: Int): EducationBackgroundSealed? {
        return EducationBackgroundSealed.getEbsByLevel(dst)
    }

    override fun src2Dst(src: EducationBackgroundSealed): Int? {
        return src.level
    }
}