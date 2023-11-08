package com.example.quizzes.data.model.response

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class QuizRandomResponse(
    @SerializedName("id")
    val id: Int,
    @SerializedName("question")
    val question: String,
    @SerializedName("answers")
    val answers: Answers,
    @SerializedName("multipleCorrectAnswers")
    val multiple_correct_answers: String,
    @SerializedName("correctAnswers")
    val correct_answers:String,
    @SerializedName("category")
    val category:String,
    @SerializedName("difficulty")
    val difficulty:String,
): Parcelable

@Parcelize
data class Answers(
    @SerializedName("answerA")
    val answer_a: String,
    @SerializedName("answerB")
    val answer_b: String,
    @SerializedName("answerC")
    val answer_c: String,
    @SerializedName("answerD")
    val answer_d: String,
    @SerializedName("answerE")
    val answer_e: String,
    @SerializedName("answerF")
    val answer_f: String,
): Parcelable

