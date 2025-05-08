package com.iaroslav_beldin.spendsense

import android.app.Application
import android.content.Context
import com.iaroslav_beldin.spendsense.di.initKoin
import org.koin.dsl.module

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin(appModule = module {
            single<Context> { this@App.applicationContext }
        })
        instance = this
    }

    companion object {
        lateinit var instance: App
    }
}