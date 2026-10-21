package pe.isil.appcomerce

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.serialization.Serializable
import pe.isil.appcomerce.features.onboarding.presentation.OnBoarding
import pe.isil.appcomerce.main.MainScreen

@Serializable
data object OnBoardingRoute

@Serializable
data object MainRoute

@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = OnBoardingRoute
    ) {
        composable<OnBoardingRoute> {
            OnBoarding(
                onNavigateToMain = {
                    navController.navigate(MainRoute) {
                        popUpTo(OnBoardingRoute) { inclusive = true }
                    }
                }
            )
        }

        composable<MainRoute> {
            MainScreen()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AppNavHostPreview() {
    AppNavHost()
}
