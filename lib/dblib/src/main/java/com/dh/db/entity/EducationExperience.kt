package com.dh.db.entity

import androidx.room.Entity

/**
 * @author wjl
 */
@Entity
data class EducationExperience(
    //学校
    var schoolName: String,
    //学历
    var educationBackground: String
) : BaseEntity() {
    //学位
    var degree: String? = null
}
