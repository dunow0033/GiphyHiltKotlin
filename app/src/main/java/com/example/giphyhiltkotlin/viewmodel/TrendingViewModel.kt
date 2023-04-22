package com.example.giphyhiltkotlin.viewmodel

import androidx.lifecycle.ViewModel
import com.example.giphyhiltkotlin.repository.TrendingRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TrendingViewModel @Inject constructor(val repo: TrendingRepository) : ViewModel() {

}