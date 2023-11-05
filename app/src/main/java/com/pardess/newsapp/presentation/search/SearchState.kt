package com.pardess.newsapp.presentation.search

import androidx.paging.PagingData
import com.pardess.newsapp.data.entity.Article
import kotlinx.coroutines.flow.Flow

data class SearchState(
    val searchQuery: String = "",
    val articles: Flow<PagingData<Article>>? = null
)