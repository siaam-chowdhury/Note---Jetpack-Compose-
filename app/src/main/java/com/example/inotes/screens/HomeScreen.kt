package com.example.inotes.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Sort
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.inotes.ExpandableNote
import com.example.inotes.components.CustomIcon
import com.example.inotes.components.CustomText
import com.example.inotes.components.SearchBar
import com.example.inotes.model.NoteDataProvider


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun HomeScreen(navController: NavController) {
    AllHomeComposableFunction()
}




@OptIn(ExperimentalMaterialApi::class)
@Composable
fun AllHomeComposableFunction() {

    val noteContent = NoteDataProvider.pushFakeData()

    Column {
        ScreeName()
        SearchBar()
        CustomIcon(
            icon = Icons.Rounded.Sort,
            topPad = 5,
            endPad = 30
        )
        Spacer(modifier = Modifier.height(10.dp))
        HomeScreenLazyColumn()
    }
}


@ExperimentalMaterialApi
@Composable
fun HomeScreenLazyColumn() {

    val noteContent = NoteDataProvider.pushFakeData()

    LazyColumn {
        items(noteContent) {notes ->
            ExpandableNote(
                title = notes.noteTitle,
                date = notes.noteDate,
                description = notes.noteDescription
            )
        }
    }
}



@Composable
fun ScreeName() {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(55.dp)
        ) {
            CustomText(
                text = "Notes",
                size = 24,
                weight = FontWeight.Bold,
                topPad = 10,
                startPad = 20,
            )
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Preview(showBackground = true)
@Composable
fun DefaultHomeScreen() {
    AllHomeComposableFunction()
}