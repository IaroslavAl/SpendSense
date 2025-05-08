package com.iaroslav_beldin.spendsense.storage

import android.content.Context
import com.iaroslav_beldin.spendsense.App
import com.russhwolf.settings.Settings
import com.russhwolf.settings.SharedPreferencesSettings

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual class AppSettings actual constructor() {
    actual val settings: Settings = SharedPreferencesSettings(
        App.instance.getSharedPreferences("AppSettings", Context.MODE_PRIVATE)
    )
}