package com.square_enix.android_googleplay.camerax.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val MyColorSchema = lightColorScheme(
    primary = Color.White,
    onPrimary = Color.White,
    onBackground = Color.White,
)

@Composable
fun CameraXTheme(
    content: @Composable () -> Unit,
) {
    MaterialTheme(
        colorScheme = MyColorSchema,
        typography = Typography,
        content = content,
    )
}
