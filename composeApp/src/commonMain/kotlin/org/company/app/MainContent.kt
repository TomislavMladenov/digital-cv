package org.company.app

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Material Design 3 Color Palette
private val DarkGray = Color(0xFF121212)
private val LightGray = Color(0xFF1E1E20)
val AccentGray = Color(0xFF222224)
private val OnBackgroundColor = Color.White

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
        // About Me Section
        Text(
            text = "About Me",
            color = OnBackgroundColor,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "I'm dynamic and creative Android developer with meticulous eye for details and concentrated focus. I find myself constantly engaged by the\n" +
                    "challenge of tackling complex problems, and building sustainable and reliable solutions.",
            color = OnBackgroundColor.copy(alpha = 0.7f),
            fontSize = 14.sp
        )

        Spacer(modifier = Modifier.height(24.dp))

        // What I'm Doing Section
        Text(
            text = "What I'm Doing",
            color = OnBackgroundColor,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(8.dp))
        ServiceCard(title = "Mobile Apps", description = "iOS and Android apps.")
        ServiceCard(
            title = "Kotlin/Compose Multiplatform",
            description = "Shared code with Kotlin and Jetpack Compose targeting Android, iOS, Desktop or Web"
        )
        ServiceCard(title = "Desktop Apps", description = "Desktop application using KMP.")
    }
}

@Composable
fun InfoRow(icon: String, text: String) {
    Row(
        modifier = Modifier.padding(vertical = 4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = icon,
            color = OnBackgroundColor,
            fontSize = 16.sp
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = text,
            color = OnBackgroundColor,
            fontSize = 14.sp
        )
    }
}

@Composable
fun ServiceCard(title: String, description: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .background(AccentGray, shape = MaterialTheme.shapes.medium)
            .padding(16.dp)
    ) {
        Text(
            text = title,
            color = OnBackgroundColor,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = description,
            color = OnBackgroundColor.copy(alpha = 0.7f),
            fontSize = 14.sp
        )
    }
}