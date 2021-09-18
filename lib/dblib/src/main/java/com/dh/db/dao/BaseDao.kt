package com.dh.db.dao

import androidx.room.Insert

/**
 * @author wjl
 */
interface BaseDao<T> {
    suspend fun getAll(): MutableList<T>

    @Insert
    suspend fun multipleInsert(vararg t: T)
}