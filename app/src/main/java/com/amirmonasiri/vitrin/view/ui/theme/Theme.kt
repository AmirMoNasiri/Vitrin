package com.amirmonasiri.vitrin.view.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColorScheme = lightColorScheme(
    primary = OrangeStart,
    secondary = PurpleGrey40,
    tertiary = Pink40,
    background = LightBackground

)

@Composable
fun VitrinTheme(
    content: @Composable () -> Unit
) {
    val colorScheme = LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}