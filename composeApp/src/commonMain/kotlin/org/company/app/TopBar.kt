@file:OptIn(InternalResourceApi::class)

package org.company.app

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import multiplatform_app.composeapp.generated.resources.Res
import multiplatform_app.composeapp.generated.resources.memojy
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.InternalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun TopBar() {
    OldVersion()
}

@Composable
private fun OldVersion() {
    Card(
        modifier = Modifier.fillMaxWidth().height(240.dp),
        colors = CardDefaults.cardColors(),
        shape = RoundedCornerShape(24.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(240.dp)
                .padding(20.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Box(
                modifier = Modifier.size(180.dp)
                    .background(MaterialTheme.colorScheme.primary, RoundedCornerShape(24.dp)),
                contentAlignment = Alignment.Center,
            ) {
                Image(
                    painter = painterResource(resource = Res.drawable.memojy),
                    contentDescription = "Profile Avatar",
                )
            }

            Column(
                modifier = Modifier.height(240.dp).weight(1f).padding(horizontal = 40.dp),
                verticalArrangement = Arrangement.spacedBy(20.dp),
            ) {
                Spacer(Modifier.weight(1f))
                Title()
                TitleDescription()
                Spacer(Modifier.weight(1f))
            }
        }
    }
}

@Composable
private fun Title() {
    Text(
        text = "Tomislav Mladenov",
        style = MaterialTheme.typography.displaySmall.copy(fontWeight = FontWeight.Bold),
    )
}

@Composable
private fun TitleDescription() {
    Text(
        text = "Software Developer",
        style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Normal),
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