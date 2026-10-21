package pe.isil.appcomerce.features.home.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import pe.isil.appcomerce.R
import pe.isil.appcomerce.core.desingsystems.theme.AppComerceTheme
import pe.isil.appcomerce.core.notifications

@Composable
fun Home(
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = viewModel()
) {
    val state = viewModel.state.collectAsStateWithLifecycle().value
    val buttonColor = Color(0xFFE6C200)

    Column(modifier = modifier.fillMaxSize()) {
        Row(
            modifier = Modifier
                .height(50.dp)
                .padding(2.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.user),
                contentDescription = "user",
                modifier = Modifier.size(48.dp).clip(CircleShape).background(buttonColor),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.width(8.dp))

            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(text = "Welcome back", fontWeight = FontWeight.Bold)
                Text(text = "John Doe")
            }
            Spacer(modifier = Modifier.weight(1f))

            IconButton(
                onClick = {},
                modifier = Modifier.size(55.dp)
            ) {
                Icon(
                    imageVector = notifications,
                    contentDescription = "notifications",
                    modifier = Modifier
                        .size(42.dp)
                        .clip(CircleShape)
                        .background(Color.White.copy(alpha = 0f))
                        .padding(8.dp)
                )
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color(0xFF001128))
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Get your\nspecial sale", textAlign = TextAlign.Left,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Text(
                    text = "Up to 50%",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Yellow
                )

                Button(
                    onClick = {},
                    modifier = Modifier.padding(horizontal = 8.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = buttonColor
                    )
                ) {
                    Text(text = "Shop now")
                }
            }

            Image(
                painter = painterResource(id = R.drawable.banner),
                contentDescription = "banner",
                modifier = Modifier.size(130.dp),
                contentScale = ContentScale.Crop
            )
        }

        ProductList(
            products = state.products,
            favoriteProductsId = state.favoriteProductIds,
            onToggleFavorite = { id -> viewModel.toggleFavorite(productId = id) }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    AppComerceTheme(dynamicColor = false) {
        Home()
    }
}
