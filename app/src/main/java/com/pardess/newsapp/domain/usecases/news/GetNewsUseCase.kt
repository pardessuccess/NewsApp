package com.pardess.newsapp.domain.usecases.news

import androidx.paging.PagingData
import com.pardess.newsapp.data.entity.Article
import com.pardess.newsapp.data.repository.NewsRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetNewsUseCase @Inject constructor(
    private val newsRepository: NewsRepository
) {
    operator fun invoke(sources: List<String>): Flow<PagingData<Article>> {
        return newsRepository.getNews(sources = sources)
    }
}