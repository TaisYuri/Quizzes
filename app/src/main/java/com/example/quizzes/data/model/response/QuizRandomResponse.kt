package com.example.quizzes.data.model.response


data class QuizRandomResponse(
    val id: Int,
    val question: String,
    val answers: List<Answers>
)

data class Answers(
    val answer_a: String,
    val answer_b: String,
)