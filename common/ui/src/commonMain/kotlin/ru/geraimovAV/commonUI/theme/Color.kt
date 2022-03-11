package ru.geraimovAV.commonUI.theme

import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color

val Red200 = Color(255, 216, 216)
val Red500 =  Color(255,216,216)
val Red700 = Color(127,0, 0)


val LightGray = Color(243, 246, 244)
internal val DarkColorPalette = darkColors(
    primary = Color.Black,
    primaryVariant = Color.LightGray,
    secondary = Color.White,
    surface = Color.Gray,
    background = Color.DarkGray
)

internal val LightColorPalette = lightColors(
    primary = Red700,
    secondary = Color.Black,
    secondaryVariant = Red500,
    surface = Color.White,
    background = Red200
)
