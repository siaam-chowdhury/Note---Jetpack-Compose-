package com.example.inotes.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.inotes.R
import com.example.inotes.model.NoteData



@Composable
fun SearchBar() {


    var value by rememberSaveable { mutableStateOf("") }
    Row(modifier = Modifier.padding(start = 17.dp, end = 17.dp)) {

        BasicTextField(
            value = value,
            onValueChange = { value = it },
            singleLine = true,
            maxLines = 1,
            textStyle = TextStyle(fontWeight = FontWeight.Medium, fontSize = 12.sp),
            decorationBox = { text ->
                Row(
                    Modifier
                        .width(320.dp)
                        .background(
                            colorResource(id = R.color.search_bar_bg),
                            RoundedCornerShape(percent = 30)
                        )
                        .padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(Icons.Rounded.Search, contentDescription = null)
                    Spacer(Modifier.width(6.dp))
                    text()
                }
            }
        )
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewSearchBar() {
}
























