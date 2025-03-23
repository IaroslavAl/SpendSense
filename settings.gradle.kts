rootProject.name = "SpendSense"

include(":shared")
include(":desktop")
include(":android")
include(":iosApp")

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}