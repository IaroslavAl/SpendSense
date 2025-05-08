package com.iaroslav_beldin.spendsense

import android.app.Application

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        lateinit var instance: App
    }
}