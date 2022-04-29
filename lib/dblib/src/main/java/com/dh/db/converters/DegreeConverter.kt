package com.dh.db.converters

import com.dh.db.converters.base.BaseTypeConverter
import com.dh.db.entity.sealeds.DegreeSealed

/**
 * @author wjl
 */
class DegreeConverter : BaseTypeConverter<DegreeSealed, Int>() {
    override fun dst2Src(dst: Int): DegreeSealed {
        return DegreeSealed.getDsByLevel(dst)
    }

    override fun src2Dst(src: DegreeSealed): Int {
        return src.level
    }
}