package com.dh.db.entity.db

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.dh.db.converters.EducationExperienceConverter
import com.dh.db.entity.bean.EducationExperience

/**
 * @author wjl
 */
@Entity(inheritSuperIndices = true)
@TypeConverters(EducationExperienceConverter::class)
data class User(
    @PrimaryKey var userId: String,
    var nickname: String
) : BaseEntity() {
    var avatar: String? = null
    var birthday: String? = null
    var phoneNumber: String? = null
    var educationExperiences: MutableList<EducationExperience>? = null

    @Ignore
    var ignore: String? = null
}