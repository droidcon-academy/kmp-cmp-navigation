package com.droidcon.shared.di

import com.droidcon.shared.domain.RecipesRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { RecipesRepository() }
}