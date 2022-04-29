package com.dh.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.dh.db.entity.db.Email

/**
 * @author wjl
 */
@Dao
interface EmailDao : BaseDao<Email> {
    @Query("SELECT * FROM Email")
    override suspend fun getAll(): MutableList<Email>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    override suspend fun multipleInsert(vararg t: Email)
}