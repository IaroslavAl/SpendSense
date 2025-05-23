package com.iaroslav_beldin.spendsense

import androidx.compose.ui.window.ComposeUIViewController
import com.iaroslav_beldin.spendsense.root.compose.RootScreen
import platform.UIKit.UIViewController


@Suppress("FunctionName", "unused")
fun MainViewController(): UIViewController =
    ComposeUIViewController {
        RootScreen()
    }