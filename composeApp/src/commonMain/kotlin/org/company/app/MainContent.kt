package org.company.app

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun MainContent() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .windowInsetsPadding(WindowInsets.safeDrawing)
            .padding(16.dp)
            .clip(RoundedCornerShape(40.dp)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TopBar()
    }
}

@Composable
private fun TopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(112.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            text = "About me",
            style = MaterialTheme.typography.displayMedium.copy(fontWeight = FontWeight.Black)
        )


    }
}