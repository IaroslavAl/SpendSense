rootProject.name = "SpendSense"

include(":shared")
include(":desktop")
include(":android")
include(":iOSApp")

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