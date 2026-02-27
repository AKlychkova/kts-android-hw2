package tech.metaclass.kts.hw2

import androidx.compose.ui.window.ComposeUIViewController
import coil3.SingletonImageLoader
import tech.metaclass.kts.hw2.compose.App

fun MainViewController() = ComposeUIViewController {
    SingletonImageLoader.setSafe { context ->
        createImageLoader(context)
    }
    App()
}
