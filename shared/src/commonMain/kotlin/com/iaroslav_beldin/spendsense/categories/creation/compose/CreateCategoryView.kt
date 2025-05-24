package com.iaroslav_beldin.spendsense.categories.creation.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.unit.dp
import com.iaroslav_beldin.spendsense.MR
import com.iaroslav_beldin.spendsense.categories.creation.CreateCategoryData
import com.iaroslav_beldin.spendsense.common.ui.atoms.AppButton
import com.iaroslav_beldin.spendsense.common.ui.atoms.AppTextField
import com.iaroslav_beldin.spendsense.common.ui.atoms.BottomModalContainer
import dev.icerock.moko.resources.compose.stringResource

@Composable
fun CreateCategoryView(
    isExpand: Boolean,
    createListener: (CreateCategoryData) -> Unit
) {
    val focusRequester by remember { mutableStateOf(FocusRequester()) }
    val focusManager = LocalFocusManager.current

    var title by remember { mutableStateOf("") }
    var subtitle by remember { mutableStateOf("") }
    var rColor by remember { mutableFloatStateOf(0.3f) }
    var gColor by remember { mutableFloatStateOf(0.6f) }
    var bColor by remember { mutableFloatStateOf(0.9f) }

    LaunchedEffect(isExpand) {
        if (isExpand) {
            focusRequester.requestFocus()
        } else {
            focusManager.clearFocus()
            title = ""
            subtitle = ""
            rColor = 0.3f
            gColor = 0.6f
            bColor = 0.9f
        }
    }

    BottomModalContainer {
        AppTextField(
            value = title,
            placeholder = stringResource(MR.strings.title_category_placeholder),
            modifier = Modifier
                .focusRequester(focusRequester)
                .fillMaxSize()
        ) { text ->
            title = text
        }

        Spacer(modifier = Modifier.height(16.dp))

        AppTextField(
            value = subtitle,
            placeholder = stringResource(MR.strings.subtitle_category_placeholder),
            modifier = Modifier.fillMaxSize()
        ) { text ->
            subtitle = text
        }

        Spacer(modifier = Modifier.height(16.dp))

        ColorBox(rColor, gColor, bColor) {
            Column {
                ColorSlider(color = Color.Red, rColor) { color ->
                    rColor = color
                }
                ColorSlider(color = Color.Green, gColor) { color ->
                    gColor = color
                }
                ColorSlider(color = Color.Blue, bColor) { color ->
                    bColor = color
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        AppButton(stringResource(MR.strings.save)) {
            createListener(
                CreateCategoryData(title, subtitle, Color(rColor, gColor, bColor).toArgb().toString(16))
            )
        }
    }
}