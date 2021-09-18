package com.dh.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * @author wjl
 */
@Entity
open class BaseEntity {
    @PrimaryKey(autoGenerate = true)
    var id = 0L

    //更新时间
    var updateTime: Long = System.currentTimeMillis()

    //创建时间
    var createTime: Long = System.currentTimeMillis()
}