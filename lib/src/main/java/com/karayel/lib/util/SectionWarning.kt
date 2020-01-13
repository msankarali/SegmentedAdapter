package com.karayel.lib.util


sealed class SectionWarning {

    object EmptyDataList : SectionWarning() {
        override fun message(): String {
            return "DataList Not Empty Case"
        }
    }

    abstract fun message() : String

}
