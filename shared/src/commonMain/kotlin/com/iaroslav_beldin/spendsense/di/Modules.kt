package com.iaroslav_beldin.spendsense.di

import com.iaroslav_beldin.spendsense.categories.CategoriesRepository
import com.iaroslav_beldin.spendsense.categories.list.compose.CategoriesViewModel
import com.iaroslav_beldin.spendsense.common.ui.calendar.DatePickerViewModel
import com.iaroslav_beldin.spendsense.platform.DeviceInfo
import com.iaroslav_beldin.spendsense.root.RootViewModel
import com.iaroslav_beldin.spendsense.settings.SettingsViewModel
import com.iaroslav_beldin.spendsense.storage.SettingsManager
import org.koin.dsl.module

object CoreModule {
    val deviceInfo = module {
        single { DeviceInfo() }
    }
}

object StorageModule {
    val settings = module {
        single { SettingsManager(get()) }
    }
}

object RepositoriesModule {
    val repositories = module {
        single { CategoriesRepository() }
    }
}

object ViewModelsModule {
    val viewModels = module {
        single { RootViewModel(get()) }
        factory { SettingsViewModel(get(), get()) }
        single { DatePickerViewModel() }
        single { CategoriesViewModel(get()) }
    }
}