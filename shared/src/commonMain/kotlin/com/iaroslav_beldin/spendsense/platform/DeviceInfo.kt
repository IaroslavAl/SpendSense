package com.iaroslav_beldin.spendsense.platform

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
expect class DeviceInfo() {
    val osName: String
    val osVersion: String
    val model: String
    val cpu: String
    val screenWidth: Int
    val screenHeight: Int
    val screenDestiny: Int

    fun getSummary(): String
}