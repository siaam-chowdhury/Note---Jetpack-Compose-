package com.example.inotes.navigation

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.inotes.R


@Composable
fun AppBottomNav(navController: NavController) {

    val listOfScreen = listOf(
        Routes.Home,
        Routes.Category,
        Routes.Setting
    )

    val backStack by navController.currentBackStackEntryAsState()
    val currentRoute = backStack?.destination?.route


    BottomNavigation(backgroundColor = colorResource(id = R.color.bottom_navigation)) {
        listOfScreen.forEach { item ->
            BottomNavigationItem(
                icon = { Icon(imageVector = item.icon, contentDescription = "") },
                selected = currentRoute == item.route,
                selectedContentColor = Color.Black,
                unselectedContentColor = Color.Black.copy(0.3f),
                onClick = {
                    navController.navigate(item.route)
                }
            )
        }
    }


}