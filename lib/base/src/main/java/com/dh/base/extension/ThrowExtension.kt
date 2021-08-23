package com.dh.base.extension

/**
 * @author wjl
 */
fun <T> dhCatch(block: () -> T): T? {
    try {
        return block()
    } catch (e: Exception) {
        e.printStackTrace()
    }
    return null
}

fun dhCatch(block: () -> Unit, blockExp: (e: Exception) -> Unit) {
    try {
        block()
    } catch (e: Exception) {
        e.printStackTrace()
        blockExp(e)
    }
}