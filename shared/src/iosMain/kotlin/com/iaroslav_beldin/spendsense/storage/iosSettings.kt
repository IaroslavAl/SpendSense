package com.iaroslav_beldin.spendsense.storage

import com.russhwolf.settings.NSUserDefaultsSettings
import com.russhwolf.settings.Settings
import platform.Foundation.NSUserDefaults

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual class AppSettings {
    actual val settings: Settings = NSUserDefaultsSettings(NSUserDefaults.standardUserDefaults())
}