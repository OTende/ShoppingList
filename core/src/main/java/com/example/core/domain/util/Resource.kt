package com.example.core.domain.util

sealed class Resource<out T>(
    open val status: Status,
    open val data: T?,
    open val message: String?
) {
    data class Success<T>(override val data: T?) : Resource<T>(Status.SUCCESS, data, null)

    data class Error<T>(override val message: String?, override val data: T? = null) :
        Resource<T>(Status.ERROR, data, message)

    data class Loading<T>(override val data: T? = null) : Resource<T>(Status.LOADING, data, null)
}

enum class Status {
    SUCCESS,
    ERROR,
    LOADING
}