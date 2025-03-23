import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import com.iaroslav_beldin.spendsense.root.RootScreen
import com.iaroslav_beldin.spendsense.sayHello


fun  main(){
    sayHello()

    application {
        val state = rememberWindowState().apply { size = DpSize(200.dp, 200.dp) }
        Window(onCloseRequest = {exitApplication()},
            state = state,
            title = "SpendSense"
        ) {
            RootScreen()
        }
    }
}