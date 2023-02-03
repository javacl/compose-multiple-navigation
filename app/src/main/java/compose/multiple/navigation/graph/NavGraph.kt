package compose.multiple.navigation.graph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import compose.multiple.navigation.screens.DetailScreen
import compose.multiple.navigation.screens.HomeScreen
import compose.multiple.navigation.screens.ProfileScreen
import compose.multiple.navigation.screens.ShopScreen

fun NavGraphBuilder.homeNavGraph(navController: NavController) {
    navigation(
        route = Graph.Home,
        startDestination = NavScreen.Home.route
    ) {
        navGraph(
            navController = navController
        )
    }
}

fun NavGraphBuilder.shopNavGraph(navController: NavController) {
    navigation(
        route = Graph.Shop,
        startDestination = NavScreen.Shop.route
    ) {
        navGraph(
            navController = navController
        )
    }
}

fun NavGraphBuilder.profileNavGraph(navController: NavController) {
    navigation(
        route = Graph.Profile,
        startDestination = NavScreen.Profile.route
    ) {
        navGraph(
            navController = navController
        )
    }
}

fun NavGraphBuilder.navGraph(navController: NavController) {

    composable(
        route = NavScreen.Home.route
    ) {
        HomeScreen(navController = navController)
    }

    composable(
        route = NavScreen.Shop.route
    ) {
        ShopScreen(navController = navController)
    }

    composable(
        route = NavScreen.Profile.route
    ) {
        ProfileScreen(navController = navController)
    }

    composable(
        route = NavScreen.Detail.route
    ) {
        DetailScreen(navController = navController)
    }
}

object Graph {

    const val Root = "root"

    const val Home = "home"

    const val Shop = "shop"

    const val Profile = "profile"
}

sealed class NavScreen(val route: String) {

    object Home : NavScreen("home")

    object Shop : NavScreen("shop")

    object Profile : NavScreen("profile")

    object Detail : NavScreen("detail")
}
