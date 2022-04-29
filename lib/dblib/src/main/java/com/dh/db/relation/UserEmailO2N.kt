package com.dh.db.relation

import androidx.room.Embedded
import androidx.room.Relation
import com.dh.db.entity.db.Email
import com.dh.db.entity.db.User

/**
 * @author wjl
 */
data class UserEmailO2N(
    @Embedded val user: User,
    @Relation(
        parentColumn = "userId",
        entityColumn = "userId")
    val emails: MutableList<Email>
)