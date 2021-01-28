package br.com.hackerman.spacextracking.network.data.repository.api

import br.com.hackerman.spacextracking.domain.model.Launch
import retrofit2.Call
import retrofit2.http.GET

interface LaunchesApi {

    @GET("latest")
    fun getLatest(): Call<Launch>

    companion object {
        const val BASE_URL = "https://api.spacexdata.com/v4/launches/"
    }
}