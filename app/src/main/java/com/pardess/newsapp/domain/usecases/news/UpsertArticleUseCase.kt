package com.pardess.newsapp.domain.usecases.news

import com.pardess.newsapp.data.local.NewsDao
import com.pardess.newsapp.data.entity.Article
import javax.inject.Inject

class UpsertArticleUseCase @Inject constructor(
    private val newsDao: NewsDao
) {

    suspend operator fun invoke(article: Article){
        newsDao.upsert(article = article)
    }

}