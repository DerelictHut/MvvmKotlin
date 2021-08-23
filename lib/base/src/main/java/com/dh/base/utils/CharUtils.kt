package com.dh.base.utils

import java.util.regex.Pattern

/**
 * @author wjl
 */
object CharUtils {
    /**
     * 获取字符串的字符长度
     *
     * @return 长度
     */
    @JvmStatic
    fun getStringCharLength(source: String?): Int {
        return source?.let {
            it.length + getChineseCount(it)
        } ?: 0
    }

    /**
     * 获取汉字的个数
     */
    @JvmStatic
    fun getChineseCount(str: String?): Int {
        return str?.let {
            var count = 0
            //unicode编码，判断是否为汉字
            val regEx = "[\\u4e00-\\u9fa5]"
            val p = Pattern.compile(regEx)
            val m = p.matcher(str)
            while (m.find()) {
                for (i in 0..m.groupCount()) {
                    count += 1
                }
            }
            count
        } ?: 0
    }
}