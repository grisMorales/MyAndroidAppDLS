package com.example.mylibrary.ui

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf

@Composable
fun DlsTheme(
    colors: DlsColorPalette = dlsLightColorPalette(),
    children: @Composable() () -> Unit
) {
    CompositionLocalProvider(
        LocalDlsColors provides colors
    ) {
        MaterialTheme(
            colors = colors.materialColors
        ) {
            children()
        }
    }
}

object DlsTheme {
    val colors: DlsColorPalette
        @Composable
        @ReadOnlyComposable
        get() = LocalDlsColors.current
}

internal val LocalDlsColors = staticCompositionLocalOf { dlsLightColorPalette() }
