package com.pardess.newsapp.presentation.details

import com.pardess.newsapp.data.entity.Article

sealed class DetailsEvent {
    data class UpsertDeleteArticle(val article: Article) : DetailsEvent()

    object RemoveSideEffect : DetailsEvent()

}