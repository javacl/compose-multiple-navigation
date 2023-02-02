package compose.multiple.navigation.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.navigation
import compose.multiple.navigation.Graph

fun NavGraphBuilder.authNavGraph(navController: NavHostController) {

    navigation(
        route = Graph.AUTH,
        startDestination = AuthNavScreen.Splash.route
    ) {

    }
}

sealed class AuthNavScreen(val route: String) {

    object Splash : AuthNavScreen("splash")

    object Login : AuthNavScreen("login")
}
