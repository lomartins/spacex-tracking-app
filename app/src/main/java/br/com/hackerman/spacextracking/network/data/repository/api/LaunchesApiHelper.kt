package br.com.hackerman.spacextracking.network.data.repository.api

import br.com.hackerman.spacextracking.domain.model.Launch
import br.com.hackerman.spacextracking.network.data.util.RetrofitUtil
import retrofit2.Call
import retrofit2.Response

object LaunchesApiHelper: LaunchesApi {

    private val apiService by lazy {
        RetrofitUtil.getApiService(LaunchesApi.BASE_URL, LaunchesApi::class.java)
    }

    override fun getLatest(): Call<Launch> {
        return apiService.getLatest()
    }
}