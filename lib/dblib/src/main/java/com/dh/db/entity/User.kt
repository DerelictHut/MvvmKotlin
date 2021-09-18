package com.dh.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * @author wjl
 */
@Entity(inheritSuperIndices = true)
data class User(
    @PrimaryKey var uid: String,
    var nickname: String
) : BaseEntity() {
    var avatar: String? = null
    var phoneNumber: String? = null
    var email: String? = null
}