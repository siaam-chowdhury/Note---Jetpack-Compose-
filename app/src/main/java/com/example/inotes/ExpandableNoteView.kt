package com.example.inotes

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.ContentAlpha.medium
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@ExperimentalMaterialApi
@Composable
fun ExpandableNote(
    title: String,
    date: String,
    description: String
) {

    var expandedState by remember { mutableStateOf(false) }
    val rotationState by animateFloatAsState(
        targetValue = if (expandedState) 180f else 0f
    )

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .animateContentSize(
                animationSpec = tween(
                    durationMillis = 200,
                    easing = LinearOutSlowInEasing
                )
            ),
        backgroundColor = colorResource(id = R.color.search_bar_bg),
        onClick = {
            expandedState = !expandedState
        }
    ) {
        Column {

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    text = title,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1,
                    modifier = Modifier
                        .weight(3f)
                        .padding(start = 15.dp)
                )

                IconButton(onClick = {
                    expandedState = !expandedState
                }) {
                    Icon(
                        Icons.Default.ArrowDropDown,
                        contentDescription = "",
                        modifier = Modifier
                            .weight(0.5f)
                            .alpha(medium)
                            .rotate(rotationState)
                    )
                }
            }

            Text(
                text = date,
                fontWeight = FontWeight.Normal,
                fontSize = 10.sp,
                color = Color.DarkGray,
                modifier = Modifier.padding(top = 5.dp, start = 15.dp, bottom = 5.dp)
            )

            if (expandedState) {
                Text(
                    text = description,
                    fontSize = 13.sp,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 4,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(
                        start = 15.dp,
                        end = 15.dp,
                        top = 10.dp,
                        bottom = 15.dp
                    )
                )
            }
        }
    }
    Spacer(modifier = Modifier.height(10.dp))


}



@OptIn(ExperimentalMaterialApi::class)
@Preview(showBackground = true)
@Composable
fun ExpandablePreview() {
}



































