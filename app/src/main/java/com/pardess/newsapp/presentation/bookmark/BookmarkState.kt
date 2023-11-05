package com.pardess.newsapp.presentation.bookmark

import com.pardess.newsapp.data.entity.Article

data class BookmarkState(
    val articleEntities: List<Article> = emptyList()
)