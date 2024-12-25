package org.company.app.theme

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

class Dimensions(
    val extraSmall: Dp,
    val small: Dp,
    val medium: Dp,
    val big: Dp,
    val large: Dp,
    val extraLarge: Dp,
    val huge: Dp,

    val screenHorizontalPadding: Dp,
)

/**
 * We can adjust these values if needed
 */
val compatDimensions = Dimensions(
    extraSmall = 2.dp,
    small = 4.dp,
    medium = 8.dp,
    big = 12.dp,
    large = 16.dp,
    extraLarge = 20.dp,
    huge = 30.dp,
    screenHorizontalPadding = 10.dp
)

val mediumDimensions = Dimensions(
    extraSmall = 4.dp,
    small = 8.dp,
    medium = 12.dp,
    big = 16.dp,
    large = 20.dp,
    extraLarge = 24.dp,
    huge = 36.dp,
    screenHorizontalPadding = 70.dp
)

val expandedDimensions = Dimensions(
    extraSmall = 6.dp,
    small = 12.dp,
    medium = 18.dp,
    big = 24.dp,
    large = 30.dp,
    extraLarge = 36.dp,
    huge = 42.dp,
    screenHorizontalPadding = 160.dp
)