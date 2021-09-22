package com.dh.db.entity

import androidx.room.TypeConverters
import com.dh.db.converters.DegreeConverter
import com.dh.db.converters.EducationBackgroundConverter
import com.dh.db.sealeds.DegreeSealed
import com.dh.db.sealeds.EducationBackgroundSealed

/**
 * @author wjl
 */
@TypeConverters(EducationBackgroundConverter::class, DegreeConverter::class)
data class EducationExperience(
    //学校
    var schoolName: String,
    //学历
    var educationBackground: EducationBackgroundSealed
) {
    //学位
    var degree: DegreeSealed? = null
}
