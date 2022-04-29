package com.dh.db.dao

import androidx.room.*
import com.dh.db.entity.db.User
import com.dh.db.relation.UserEmailNameO2N
import com.dh.db.relation.UserEmailO2N

/**
 * @author wjl
 */
@Dao
interface UserDao : BaseDao<User> {
    @Query("SELECT * FROM User")
    override suspend fun getAll(): MutableList<User>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    override suspend fun multipleInsert(vararg t: User)

    @Transaction //保证原子性
    @Query("SELECT * FROM User")
    suspend fun getUserEmailList(): MutableList<UserEmailO2N>

    @Transaction
    @Query("SELECT * FROM User")
    suspend fun getUserEmailNameList(): MutableList<UserEmailNameO2N>
}