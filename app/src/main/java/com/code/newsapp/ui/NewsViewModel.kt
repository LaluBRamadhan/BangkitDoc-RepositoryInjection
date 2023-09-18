package com.code.newsapp.ui

import androidx.lifecycle.ViewModel
import com.code.newsapp.data.NewsRepository

class NewsViewModel(private val newsRepository: NewsRepository): ViewModel() {
    fun getHeadLineNews() = newsRepository.getHeadlineNews()
}