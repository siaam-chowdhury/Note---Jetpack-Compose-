package com.example.inotes.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.inotes.R


@Composable
fun CustomText(
    text: String,
    weight: FontWeight = FontWeight.Normal,
    size: Int = 16,
    color: Color = colorResource(id = R.color.black),
    startPad: Int = 0,
    endPad: Int = 0,
    topPad: Int = 0,
    bottomPad: Int = 0
) {
    Text(
        text = text,
        fontWeight = weight,
        fontSize = size.sp,
        color = color,
        modifier = Modifier.padding(
            start = startPad.dp,
            top = topPad.dp,
            end = endPad.dp,
            bottom = bottomPad.dp
        )
    )
}