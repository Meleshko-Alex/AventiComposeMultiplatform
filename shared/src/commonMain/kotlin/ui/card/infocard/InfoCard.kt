package ui.card.infocard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun InfoCard(imageBackground: String) {
    Card(
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 2.dp, end = 2.dp)
            .size(height = 420.dp, width = 200.dp)
    ) {
        Image(
            painter = painterResource(imageBackground),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )

        Column {
            AvatarAndName("mock_john_avatar.jpeg", "John Smith")

            Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Bottom) {
                AdventureActionList(
                    "Rockclimbing in Blue Mountain",
                    listOf("Rockclimbing", "Hiking", "Exploring")
                )
            }
        }
    }
}

/*
@Preview
@Composable
fun InfoCardPreview() {
    AventiTheme {
        InfoCard("pickture_mock_1.jpeg")
    }
}*/
