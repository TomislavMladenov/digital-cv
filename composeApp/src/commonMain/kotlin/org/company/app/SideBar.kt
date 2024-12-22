package org.company.app

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun RowScope.SideBar() {

    Column(
        modifier = Modifier.width(400.dp).padding(30.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Box(modifier = Modifier.size(240.dp).background(Color.Black))

        Title()

        HorizontalDivider(modifier = Modifier.fillMaxWidth(.8f))

        InfoItems(
            text = "tomislavmladenov1@gmail.com",
            icon = Icons.Default.Email
        )
    }
}

@Composable
private fun Title() {
    Text(
        text = "Tomislav Mladenov",
        style = MaterialTheme.typography.displayMedium.copy(fontWeight = FontWeight.Bold),
        modifier = Modifier.padding(
            top = 16.dp,
            bottom = 16.dp,
        )
    )
}

@Composable
private fun InfoItems(
    text: String,
    icon: ImageVector
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier.padding(end = 16.dp)
        )
        Spacer(Modifier.width(20.dp))
        Text(
            modifier = Modifier.weight(1f),
            text = text,
            style = MaterialTheme.typography.bodyLarge,
            textAlign = TextAlign.Start
        )
    }
}