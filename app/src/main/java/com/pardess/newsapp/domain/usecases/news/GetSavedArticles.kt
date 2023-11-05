package com.pardess.newsapp.domain.usecases.news

import com.pardess.newsapp.data.local.NewsDao
import com.pardess.newsapp.data.entity.Article
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetSavedArticles @Inject constructor(
    private val newsDao: NewsDao
) {

    operator fun invoke(): Flow<List<Article>>{
        return newsDao.getArticles()
    }

}