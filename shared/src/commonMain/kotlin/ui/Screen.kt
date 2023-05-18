package ui


val items = listOf(Screen.Home, Screen.Profile, null,  Screen.Compass, Screen.Messages)

sealed class Screen(val route: String, val title: String?, val iconResource: String?) {
    object Home : Screen("home", "Home", "home.xml")

    object Profile : Screen("profile", "Profile", "profile.xml")

    object Compass : Screen("compass", "Compass", "compass.xml")

    object Messages : Screen("messages", "Messages", "message.xml")

    object Add : Screen("add", null, "plus.xml")
}