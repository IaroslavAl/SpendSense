package com.iaroslav_beldin.spendsense

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.iaroslav_beldin.spendsense.root.compose.RootScreen
import com.iaroslav_beldin.spendsense.root.RootViewModel

class RootActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RootScreen(viewModel = RootViewModel())
        }
    }
}