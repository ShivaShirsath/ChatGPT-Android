package com.nohjunh.test.network

import com.google.gson.JsonObject
import com.nohjunh.test.model.GptResponse
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface Apis {
    @Headers(
        "Content-Type:application/json",
        "Authorization:Bearer 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")
    @POST("v1/completions")
    suspend fun postRequest(
        @Body json : JsonObject
    ) : GptResponse

}