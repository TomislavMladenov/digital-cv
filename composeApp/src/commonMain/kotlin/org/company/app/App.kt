package org.company.app

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.company.app.theme.AppTheme

@Composable
internal fun App() = AppTheme {

    Row(
        modifier = Modifier.fillMaxSize().padding(10.dp),
    ) {
        SideBar()

        MainContent()
    }
}
