package com.ramanaptr.fileuploader.helpers

import java.text.SimpleDateFormat
import java.util.*

object DateHelper {

    fun formatDate(date: Date?): String {
        return SimpleDateFormat("dd-MM-yyyy").format(date)
    }
}