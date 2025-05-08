import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.unit.dp
import com.iaroslav_beldin.spendsense.common.ui.AppThemeProvider
import com.iaroslav_beldin.spendsense.root.model.BottomBarItem
import dev.icerock.moko.resources.compose.painterResource
import dev.icerock.moko.resources.compose.stringResource

@Composable
fun RowScope.BottomBarItemView(
    bottomBarItem: BottomBarItem,
    isSelected: Boolean,
    clickOnTab: () -> Unit
) {
    val foreground = if (isSelected) AppThemeProvider.colors.accent else AppThemeProvider.colors.onSurface
    Column(
        modifier = Modifier
            .weight(1f)
            .padding(4.dp)
            .clickable { clickOnTab() },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter =  painterResource(bottomBarItem.icon),
            contentDescription = stringResource(bottomBarItem.title),
            modifier = Modifier.size(22.dp),
            colorFilter = ColorFilter.tint(foreground)
        )
        Text(
            text = stringResource(bottomBarItem.title),
            color = foreground,
            modifier = Modifier.padding(top = 4.dp)
        )
    }
}