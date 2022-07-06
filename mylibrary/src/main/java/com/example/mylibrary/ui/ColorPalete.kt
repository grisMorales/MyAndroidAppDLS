package com.example.mylibrary.ui

import androidx.compose.material.Colors
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color
import com.example.mylibrary.ui.tokenEngine.StyleDictionaryColor

interface DlsColorPalette {
    val primary: Color
    val background: Color
    val basic: Color
    val disable: Color
    val text: Color

    val materialColors: Colors
}

fun dlsLightColorPalette(): DlsColorPalette = object : DlsColorPalette {
    override val primary: Color = StyleDictionaryColor.colorBaseGrayDark
    override val background: Color = StyleDictionaryColor.colorBaseRed
    override val basic: Color = StyleDictionaryColor.colorBaseGreen
    override val disable: Color = StyleDictionaryColor.colorBaseGrayLight
    override val text: Color = StyleDictionaryColor.colorFontBase

    override val materialColors: Colors = lightColors(
        primary = StyleDictionaryColor.colorBaseGreen,
        background = StyleDictionaryColor.colorBaseRed
    )
}

fun dlsDarkColorPalette(): DlsColorPalette = object : DlsColorPalette {
    override val primary: Color = StyleDictionaryColor.colorFontSecondary
    override val background: Color = StyleDictionaryColor.colorBaseRed
    override val basic: Color = StyleDictionaryColor.colorFontSecondary
    override val disable: Color = StyleDictionaryColor.colorBaseGrayDark
    override val text: Color = StyleDictionaryColor.colorBaseGrayMedium

    override val materialColors: Colors = darkColors(
        primary = StyleDictionaryColor.colorBaseRed,
        background = StyleDictionaryColor.colorBaseGrayMedium
    )
}

