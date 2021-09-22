package com.dh.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.dh.db.converters.EducationExperienceConverter

/**
 * @author wjl
 */
@Entity(inheritSuperIndices = true)
@TypeConverters(EducationExperienceConverter::class)
data class User(
    @PrimaryKey var uid: String,
    var nickname: String
) : BaseEntity() {
    var avatar: String? = null
    var phoneNumber: String? = null
    var email: String? = null
    var educationExperiences: MutableList<EducationExperience>? = null
}