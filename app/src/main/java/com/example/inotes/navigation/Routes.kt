package com.example.inotes.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Category
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Routes(
    val route: String,
    val title: String,
    val icon: ImageVector
) {

    object Home : Routes(
        route = "home",
        title = "Home",
        icon = Icons.Rounded.Home
    )

    object Category : Routes(
        route = "category",
        title = "Category",
        icon = Icons.Rounded.Category
    )

    object Setting : Routes(
        route = "setting",
        title = "Setting",
        icon = Icons.Rounded.Settings
    )

}
