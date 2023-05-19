package ui.elements.navigation.navigation

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import ui.Screen
import ui.theme.Fab

@OptIn(ExperimentalResourceApi::class)
@Composable
fun BottomBarWithFab() {
    /*val navController = rememberNavController()
    Scaffold(
        modifier = Modifier.navigationBarsPadding(),
        backgroundColor = Color.Transparent,
        bottomBar = {
            BottomAppBar(
                Modifier.fillMaxWidth(),
                cutoutShape = CircleShape,
                backgroundColor = Color.Transparent
            ) {
                BottomNav(navController = navController)
            }
        },
        floatingActionButtonPosition = FabPosition.Center,
        isFloatingActionButtonDocked = true,
        floatingActionButton = {
            FloatingActionButton(
                shape = CircleShape,
                onClick = {
                    Screen.Add.route.let {
                        navController.navigate(it) {
                            popUpTo(navController.graph.findStartDestination().id) {
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                    Screen.Add.route.let { navController.navigate(it) }
                },
                contentColor = Color.White,
                backgroundColor = Fab
            ) {
                Screen.Add.iconResource?.let {
                    Icon(
                        painter = painterResource(it),
                        contentDescription = "Add icon"
                    )
                }
            }
        }
    ) {
        MainScreenNavigation(navController, it)
    }*/
}

/*
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AventiTheme {
        BottomBarWithFab()
    }
}*/
