package com.pardess.newsapp.domain.usecases.news

import com.pardess.newsapp.data.local.NewsDao
import com.pardess.newsapp.data.entity.Article
import javax.inject.Inject

class GetSavedArticleUseCase @Inject constructor(
    private val newsDao: NewsDao
) {

    suspend operator fun invoke(url: String): Article?{
        return newsDao.getArticle(url = url)
    }

}