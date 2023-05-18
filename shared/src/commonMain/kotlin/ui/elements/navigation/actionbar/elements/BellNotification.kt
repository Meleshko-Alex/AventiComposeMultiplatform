package ui.elements.navigation.actionbar.elements

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import ui.theme.Fab

@OptIn(ExperimentalResourceApi::class)
@Composable
fun BellNotification(hasNotification: Boolean) {
    Box(modifier = Modifier.size(26.dp, 30.dp)) {
        // Bell icon
        Icon(
            painter = painterResource("bell.xml"),
            contentDescription = "Bell icon",
            modifier = Modifier
                .align(Alignment.BottomStart),
            tint = Color.White
        )

        // Notification circle
        if (hasNotification) {
            Box(
                modifier = Modifier
                    .size(9.dp)
                    .background(color = Fab, shape = CircleShape)
                    .align(Alignment.TopEnd)
            ) {
            }
        }
    }
}

/*
@Preview
@Composable
fun BellNotificationPreview() {
    AventiTheme {
        BellNotification(true)
    }
}*/
