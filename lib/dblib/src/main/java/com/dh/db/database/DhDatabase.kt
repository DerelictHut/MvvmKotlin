package com.dh.db.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.dh.db.converters.DateConverter
import com.dh.db.dao.EmailDao
import com.dh.db.dao.UserDao
import com.dh.db.entity.db.Email
import com.dh.db.entity.db.User

/**
 * @author wjl
 */
@Database(version = 3, exportSchema = false, entities = [User::class, Email::class])
@TypeConverters(DateConverter::class)
abstract class DhDatabase : RoomDatabase() {
    val userDao: UserDao by lazy { createUserDao() }
    val emailDao: EmailDao by lazy { createEmailDao() }

    abstract fun createUserDao(): UserDao
    abstract fun createEmailDao(): EmailDao
}