package com.droidcon.home

import androidx.lifecycle.ViewModel
import com.droidcon.shared.domain.RecipesRepository

class HomeViewModel(
    private val repository: RecipesRepository
): ViewModel() {
    fun getAllRecipes() = repository.getAllRecipes()
}