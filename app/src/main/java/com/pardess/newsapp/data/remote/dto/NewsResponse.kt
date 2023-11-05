package com.pardess.newsapp.data.remote.dto

import com.pardess.newsapp.data.entity.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)