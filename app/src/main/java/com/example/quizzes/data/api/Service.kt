package com.example.quizzes.data.api

import com.example.quizzes.data.model.response.QuizRandomResponse
import retrofit2.http.GET

interface Service {
    @GET("questions")
    suspend fun getQuizRandom(): QuizRandomResponse
}