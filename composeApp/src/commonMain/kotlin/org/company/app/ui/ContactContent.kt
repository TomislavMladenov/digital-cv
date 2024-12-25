package org.company.app.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ContactContent() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF1F1F1F)) // Dark background color
            .padding(16.dp)
    ) {
        // Title
        Text(
            text = "Contact",
            color = Color.White,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // Map Section
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(Color(0xFF2A2A2A), shape = RoundedCornerShape(8.dp))
                .padding(8.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Map Placeholder",
                color = Color.Gray,
                fontSize = 16.sp
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Contact Form
        Text(
            text = "Contact Form",
            color = Color.White,
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        // Input Fields
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            // Full Name
            OutlinedTextField(
                value = "",
                onValueChange = {},
                placeholder = { Text("Full name", color = Color.Gray) },
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF2A2A2A), shape = RoundedCornerShape(8.dp)),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color.Transparent,
                    focusedBorderColor = Color(0xFFFFC107),
                    cursorColor = Color.White,
                    focusedTextColor = Color.White,
                    unfocusedTextColor = Color.White,
                )
            )

            // Email Address
            OutlinedTextField(
                value = "",
                onValueChange = {},
                placeholder = { Text("Email address", color = Color.Gray) },
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF2A2A2A), shape = RoundedCornerShape(8.dp)),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color.Transparent,
                    focusedBorderColor = Color(0xFFFFC107),
                    cursorColor = Color.White,
                    focusedTextColor = Color.White,
                    unfocusedTextColor = Color.White,
                )
            )

            // Message
            OutlinedTextField(
                value = "",
                onValueChange = {},
                placeholder = { Text("Your Message", color = Color.Gray) },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
                    .background(Color(0xFF2A2A2A), shape = RoundedCornerShape(8.dp)),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color.Transparent,
                    focusedBorderColor = Color(0xFFFFC107),
                    cursorColor = Color.White,
                    focusedTextColor = Color.White,
                    unfocusedTextColor = Color.White,
                )
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Send Message Button
        Button(
            onClick = { /* Handle click */ },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFFFC107)
            ),
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .align(Alignment.End)
                .padding(end = 16.dp)
        ) {
            Text(text = "Send Message", color = Color.Black)
        }
    }
}