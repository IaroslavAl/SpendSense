
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import com.iaroslav_beldin.spendsense.di.initKoin
import com.iaroslav_beldin.spendsense.root.compose.RootScreen

fun main(){
    initKoin()

    application {
        val state = rememberWindowState().apply { size = DpSize(400.dp, 800.dp) }
        Window(onCloseRequest = {exitApplication()},
            state = state,
            title = "SpendSense"
        ) {
            RootScreen()
        }
    }
}