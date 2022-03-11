package ru.geraimovAV.commonUI.contentSurface

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ru.geraimovAV.commonUI.text.Title

@Composable
fun ContentSurface(
    modifier: Modifier = Modifier,
    title: String,
    content: @Composable () -> Unit,
) {
    Surface(
        modifier = modifier,
        color = MaterialTheme.colors.secondaryVariant,
        shape = RoundedCornerShape(28.dp),
        contentColor =MaterialTheme.colors.primary
    ) {
        Column (horizontalAlignment = Alignment.CenterHorizontally) {
            Title(title)
            content()
        }
    }
}