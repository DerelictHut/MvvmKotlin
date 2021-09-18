package com.dh.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.dh.db.entity.User

/**
 * @author wjl
 */
@Dao
interface UserDao : BaseDao<User> {
    @Query("SELECT * FROM User")
    override suspend fun getAll(): MutableList<User>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    override suspend fun multipleInsert(vararg t: User)
}