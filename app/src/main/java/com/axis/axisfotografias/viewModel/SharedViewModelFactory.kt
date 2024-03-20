package com.axis.axisfotografias.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.axis.axisfotografias.data.MinutasRepository

class SharedViewModelFactory(private val repository: MinutasRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SharedViewModel::class.java)) {
            return SharedViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
