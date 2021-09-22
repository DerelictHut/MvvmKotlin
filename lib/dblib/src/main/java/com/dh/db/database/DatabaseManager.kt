package com.dh.db.database

import android.app.Application
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.blankj.utilcode.util.Utils

/**
 * @author wjl
 */
object DatabaseManager {
    private const val DB_NAME = "derelict_hut.db"
    private val MIGRATIONS = arrayOf(Migration1, Migration2)
    private val application: Application by lazy { Utils.getApp() }
    val db: DhDatabase by lazy {
        Room.databaseBuilder(application.applicationContext, DhDatabase::class.java, DB_NAME)
            .addMigrations(*MIGRATIONS)
            .build()
    }

    private object CreatedCallBack : RoomDatabase.Callback() {
        override fun onCreate(db: SupportSQLiteDatabase) {
            //在新装app时会调用，调用时机为数据库build()之后，数据库升级时不调用此函数
        }
    }

    private object Migration1 : Migration(1, 2) {
        override fun migrate(database: SupportSQLiteDatabase) {
            database.execSQL("alter table User add column 'phoneNumber' varchar(20)")
        }
    }

    private object Migration2 : Migration(2, 3) {
        override fun migrate(database: SupportSQLiteDatabase) {
            database.execSQL("alter table User add column 'email' varchar(50)")
        }
    }
}