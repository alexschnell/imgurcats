package br.com.imgurcats.network

import br.com.imgurcats.model.ImgurResponse
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ImgurApiService {
    @Headers("Authorization: Client-ID 1ceddedc03a5d71")
    @GET("gallery/search/")
    suspend fun searchImages(@Query("q") query: String): ImgurResponse
}

