package com.example.wikipedia_14.data

data class ItemPost(
    val imgUrl: String,
    val txtTitle: String,
    val txtSubtitle: String,
    val txtDetail: String ,

    // for trend fragment =>
    val isTrend :Boolean ,
    val insight :String

)