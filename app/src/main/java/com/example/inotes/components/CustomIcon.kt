package com.example.inotes.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Sort
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp


@Composable
fun CustomIcon(
    startPad: Int = 0,
    endPad: Int = 0,
    topPad: Int = 0,
    bottomPad: Int = 0,
    icon: ImageVector
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                top = topPad.dp,
                end = endPad.dp,
                start = startPad.dp,
                bottom = bottomPad.dp
            ),
        horizontalArrangement = Arrangement.End
    ) {
        Icon(icon, contentDescription = null)
    }
}