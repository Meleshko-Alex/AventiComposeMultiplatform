package ui.elements.navigation.actionbar

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aventi.ui.elements.navigation.actionbar.elements.BellNotification
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun AventiActionBar(avatar: String, name: String, hasNotification: Boolean) {
    Row(
        modifier = Modifier
            .padding(top = 66.dp, start = 16.dp, end = 16.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Round avatar
        Image(
            painter = painterResource(avatar),
            contentDescription = "avatar",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(30.dp)
                .clip(CircleShape)
        )

        // Text in the middle - Aventi
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = name,
            color = Color.White,
            fontSize = 23.sp,
            fontWeight = FontWeight.SemiBold,
        )

        // BellNotification
        Spacer(modifier = Modifier.weight(1f))
        BellNotification(hasNotification = hasNotification)
    }
}

/*@Preview
@Composable
fun BellNotificationPreview() {
    AventiTheme {
        AventiActionBar(
            avatar = "mock_david_avatar.jpeg",
            name = "Aventi",
            hasNotification = true
        )
    }
}*/
