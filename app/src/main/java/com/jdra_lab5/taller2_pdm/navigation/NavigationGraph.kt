package com.jdra_lab5.taller2_pdm.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.jdra_lab5.taller2_pdm.ui.theme.screens.OrdersScreen
import com.jdra_lab5.taller2_pdm.ui.theme.screens.SearchScreen
import com.jdra_lab5.taller2_pdm.ui.theme.screens.HomeScreen
import com.jdra_lab5.taller2_pdm.ui.theme.screens.MenuScreen

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Search : Screen("search")
    object Orders : Screen("orders")
    object Menu : Screen("menu/{restaurantName}") {
        fun createRoute(name: String) = "menu/$name"
    }
}

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(Screen.Home.route) {
            println("DEBUG: HomeScreen cargado")
            HomeScreen(navController)
        }
        composable(Screen.Search.route) {
            SearchScreen()
        }
        composable(Screen.Orders.route) {
            OrdersScreen()
        }
        composable(Screen.Menu.route) { backStackEntry ->
            val name = backStackEntry.arguments?.getString("restaurantName") ?: ""
            MenuScreen(navController, name)
        }
    }
}
