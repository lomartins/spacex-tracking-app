package br.com.hackerman.spacextracking.network.data.util

data class Resource<out T>(val status: StatusEnum, val data: T?, val message: String?) {
    companion object {
        fun <T> success(data: T): Resource<T> = Resource(status = StatusEnum.SUCCESS, data = data, message = null)

        fun <T> error(data: T?, message: String): Resource<T> =
            Resource(status = StatusEnum.ERROR, data = data, message = message)

        fun <T> loading(data: T?): Resource<T> = Resource(status = StatusEnum.LOADING, data = data, message = null)
    }
}