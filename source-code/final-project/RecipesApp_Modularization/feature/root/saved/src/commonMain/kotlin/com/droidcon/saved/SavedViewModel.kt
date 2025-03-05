package com.droidcon.saved

import androidx.lifecycle.ViewModel
import com.droidcon.shared.domain.RecipesRepository

class SavedViewModel(
    private val repository: RecipesRepository
): ViewModel() {
    fun getSavedRecipes() = repository.getSavedRecipes()
}