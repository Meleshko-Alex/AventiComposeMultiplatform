package ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import ui.card.infocard.AventiFooter
import ui.card.infocard.InfoCard
import ui.card.infocard.getMockAdventure
import ui.elements.navigation.actionbar.AventiActionBar
import ui.elements.navigation.navigation.BottomBarWithFab
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource


@OptIn(ExperimentalResourceApi::class)
@Composable
fun HomeScreen() {
    Box(
        modifier = with(Modifier) {
            fillMaxSize()
                .paint(
                    painterResource("blurred_background.jpeg"),
                    contentScale = ContentScale.FillBounds
                )
        })
    {
        Column {
            AventiActionBar(
                avatar = "mock_david_avatar.jpeg",
                name = "Aventi",
                hasNotification = true
            )
            Icon(
                painter = painterResource("settings.xml"),
                contentDescription = null,
                modifier = Modifier.padding(start = 16.dp, top = 30.dp),
                tint = Color.White
            )
            Spacer(modifier = Modifier.height(16.dp))

            Column(Modifier.fillMaxSize()) {
                InfoCard(imageBackground = "pickture_mock_1.jpeg")
                AventiFooter(getMockAdventure())
            }
        }

        //BottomBarWithFab()
    }
}

/*
@Preview
@Composable
fun HomeScreenPreview() {
    AventiTheme {
        HomeScreen()
    }
}*/
