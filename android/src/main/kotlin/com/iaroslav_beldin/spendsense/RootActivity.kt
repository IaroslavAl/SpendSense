package com.iaroslav_beldin.spendsense

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class RootActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SayHelloFromCommon()
        }
    }
}