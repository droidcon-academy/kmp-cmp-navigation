package com.droidcon.recipes.di

import com.droidcon.di.koinModules
import com.droidcon.shared.di.repositoryModule
import org.koin.core.context.startKoin

fun initializeKoin() {
    startKoin {
        modules(repositoryModule, koinModules)
    }
}