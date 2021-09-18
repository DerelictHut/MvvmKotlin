package com.dh.db.dao

import androidx.room.Dao
import androidx.room.Query
import com.dh.db.entity.EducationExperience

/**
 * @author wjl
 */
@Dao
interface EducationExperienceDao : BaseDao<EducationExperience> {
    @Query("SELECT * FROM EducationExperience")
    override suspend fun getAll(): MutableList<EducationExperience>
}