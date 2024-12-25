package org.company.app.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ColumnScope.TopNavigationBar() {
    val tabs = listOf("About", "Resume", "Portfolio", "Blog", "Contact")
    val selectedTabIndex = remember { 4 } // Highlight "Contact" as selected (index 4)

    // Navigation Tabs
    Row(
        modifier = Modifier
            .align(Alignment.End)
            .fillMaxWidth(.5f)
            .padding(horizontal = 16.dp)
            .background(Color(0xFF2A2A2A), shape = RoundedCornerShape(8.dp)),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        tabs.forEachIndexed { index, tab ->
            TabItem(
                text = tab,
                isSelected = index == selectedTabIndex,
                onClick = { /* Handle tab selection */ }
            )
        }
    }
}

@Composable
fun TabItem(
    text: String,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    TextButton(
        onClick = onClick,
        colors = ButtonDefaults.textButtonColors(
            contentColor = if (isSelected) Color.White else Color.Gray
        ),
        modifier = Modifier.padding(vertical = 8.dp)
    ) {
        Text(
            text = text,
            fontSize = 14.sp,
            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
            color = if (isSelected) Color.White else Color.Gray
        )
    }
}