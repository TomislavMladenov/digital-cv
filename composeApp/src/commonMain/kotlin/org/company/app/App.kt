package org.company.app

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.company.app.theme.AppTheme
import org.company.app.theme.MaterialTheme
import org.company.app.ui.TopNavigationBar

@Composable
internal fun App() = AppTheme {
    Column(
        modifier = Modifier.fillMaxSize().padding(
            horizontal = MaterialTheme.dimensions.screenHorizontalPadding,
            vertical = 20.dp
            ),
    ) {
//        TopNavigationBar()
//
//        Spacer(Modifier.height(MaterialTheme.dimensions.medium))

        TopBar()
        MainContent()
    }
}
