package ru.geraimovAV.commonUI.text

import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun Title(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier.padding(vertical = 10.dp),
        text = text,
        color = MaterialTheme.colors.primary,
        fontWeight = FontWeight.Bold
        )
}