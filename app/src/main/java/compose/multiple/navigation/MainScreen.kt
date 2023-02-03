package compose.multiple.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import compose.multiple.navigation.graph.Graph
import compose.multiple.navigation.graph.homeNavGraph
import compose.multiple.navigation.graph.profileNavGraph
import compose.multiple.navigation.graph.shopNavGraph

@Composable
fun MainScreen() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Graph.Home,
        route = Graph.Root
    ) {

        homeNavGraph(navController = navController)

        shopNavGraph(navController = navController)

        profileNavGraph(navController = navController)
    }
}
