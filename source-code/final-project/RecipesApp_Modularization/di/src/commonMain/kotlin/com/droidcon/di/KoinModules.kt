package com.droidcon.di

import com.droidcon.details.DetailsViewModel
import com.droidcon.home.HomeViewModel
import com.droidcon.saved.SavedViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val koinModules = module {
    viewModel { HomeViewModel(repository = get()) }
    viewModel { DetailsViewModel(repository = get()) }
    viewModel { SavedViewModel(repository = get()) }
}