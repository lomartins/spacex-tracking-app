package br.com.hackerman.spacextracking.network.data.repository

import br.com.hackerman.spacextracking.domain.model.Launch
import br.com.hackerman.spacextracking.network.data.repository.api.LaunchesApiHelper
import kotlinx.coroutines.runBlocking
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


object SpaceXRepository {
    suspend fun getLatestLaunch(): Call<Launch> {
        return LaunchesApiHelper.getLatest()
    }

}