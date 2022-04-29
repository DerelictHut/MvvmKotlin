package com.dh.db.entity.db

import androidx.room.Entity
import androidx.room.PrimaryKey


/**
 * @author wjl
 */


@Entity
data class Email(
    @PrimaryKey
    var email: String,
    var userId: String
) : BaseEntity()