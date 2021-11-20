package com.ramanaptr.fileuploader.base

import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonPropertyOrder(
    "code",
    "messages",
    "data"
)
data class BaseResponse<T>(
    val code: Int,
    val message: String,
    val data: T
)