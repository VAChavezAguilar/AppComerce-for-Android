package pe.isil.appcomerce.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import pe.isil.appcomerce.R
import pe.isil.appcomerce.core.favorite
import pe.isil.appcomerce.core.favoriteOutlined
import pe.isil.appcomerce.core.home
import pe.isil.appcomerce.core.homeOutlined
import pe.isil.appcomerce.core.shopping_cart
import pe.isil.appcomerce.core.shopping_cartOutlined
import pe.isil.appcomerce.features.favorites.presentation.FavoriteScreen
import pe.isil.appcomerce.features.home.presentation.Home
import pe.isil.appcomerce.features.shoppingCart.presentation.ShoppingCartScreen

@Composable
fun MainScreen() {
    var selectedTab by remember {
        mutableStateOf(MainScreenTab.HOME)
    }

    Scaffold(
        bottomBar = {
            NavigationBar {
                MainScreenTab.entries.forEach { tab ->
                    val selected = tab == selectedTab
                    NavigationBarItem(
                        selected = selected,
                        onClick = {
                            selectedTab = tab
                        },
                        icon = {
                            Icon(
                                imageVector = if (selected) tab.icon else tab.outlinedIcon,
                                contentDescription = stringResource(id = tab.title)
                            )
                        },
                        label = {
                            Text(text = stringResource(id = tab.title))
                        }
                    )
                }
            }
        }
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            when (selectedTab) {
                MainScreenTab.HOME -> Home()
                MainScreenTab.FAVORITES -> FavoriteScreen()
                MainScreenTab.SHOPPING_CART -> ShoppingCartScreen()
            }
        }
    }
}

enum class MainScreenTab(
    val icon: ImageVector,
    val outlinedIcon: ImageVector,
    val title: Int
) {
    FAVORITES(
        icon = favorite,
        outlinedIcon = favoriteOutlined,
        title = R.string.tab_favorites
    ),
    HOME(
        icon = home,
        outlinedIcon = homeOutlined,
        title = R.string.tab_home
    ),
    SHOPPING_CART(
        icon = shopping_cart,
        outlinedIcon = shopping_cartOutlined,
        title = R.string.tab_shopping_cart
    ),
}
