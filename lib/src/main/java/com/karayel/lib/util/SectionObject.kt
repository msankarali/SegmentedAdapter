package com.karayel.lib.util

interface SectionObject<K> {
    fun getUniqueKey(): Any
    fun getSectionObj(): K
}