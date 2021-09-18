package com.dh.db.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.dh.db.dao.EducationExperienceDao
import com.dh.db.dao.UserDao
import com.dh.db.entity.EducationExperience
import com.dh.db.entity.User

/**
 * @author wjl
 */
@Database(version = 3, exportSchema = false, entities = [User::class, EducationExperience::class])
abstract class DhDatabase : RoomDatabase() {
    val userDao: UserDao by lazy { createUserDao() }

    abstract fun createUserDao(): UserDao

    val educationExperienceDao: EducationExperienceDao by lazy { createEducationExperienceDao() }

    abstract fun createEducationExperienceDao(): EducationExperienceDao
}