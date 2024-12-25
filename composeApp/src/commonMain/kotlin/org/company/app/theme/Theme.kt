@file:OptIn(ExperimentalMaterial3WindowSizeClassApi::class, ExperimentalComposeUiApi::class)

package org.company.app.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.*
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.platform.LocalWindowInfo


internal val LocalThemeIsDark = compositionLocalOf { mutableStateOf(true) }
private val LocalDimens = staticCompositionLocalOf { expandedDimensions }

@Composable
internal fun AppTheme(
    content: @Composable () -> Unit
) {
//    val systemIsDark = isSystemInDarkTheme()
//    val isDarkState = remember(systemIsDark) { mutableStateOf(systemIsDark) }
    val isDarkState = remember { mutableStateOf(true) }

    val windowSizeClass: WindowSizeClass = calculateWindowSizeClass()

    val isDark by isDarkState
    SystemAppearance(!isDark)

    val dimensions = when (windowSizeClass.widthSizeClass) {
        WindowWidthSizeClass.Compact -> compatDimensions
        WindowWidthSizeClass.Medium -> mediumDimensions
        WindowWidthSizeClass.Expanded -> expandedDimensions
        else -> expandedDimensions
    }

    CompositionLocalProvider(
        LocalThemeIsDark provides isDarkState
    ) {
        CompositionLocalProvider(
            LocalDimens provides dimensions
        ) {
            MaterialTheme(
                colorScheme = if (isDark) DarkColorScheme else LightColorScheme,
                content = { Surface(content = content) }
            )
        }
    }
}

@Composable
internal expect fun SystemAppearance(isDark: Boolean)

object MaterialTheme {
    val dimensions: Dimensions
        @Composable
        @ReadOnlyComposable
        get() = LocalDimens.current
}
