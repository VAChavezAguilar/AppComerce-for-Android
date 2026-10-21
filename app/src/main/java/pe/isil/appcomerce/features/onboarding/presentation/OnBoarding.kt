package pe.isil.appcomerce.features.onboarding.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pe.isil.appcomerce.R
import pe.isil.appcomerce.core.Icons

@Composable
fun OnBoarding(
    modifier: Modifier = Modifier,
    onNavigateToMain: () -> Unit = {}
) {
    val buttonColor = Color(0xFFE6C200)

    Column(
        modifier = modifier.fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = "background",
            modifier = Modifier
                .fillMaxHeight(0.8f)
                .graphicsLayer { translationY = -300f }
        )
        Text(
            text = "Boost Your Style Sense", textAlign = TextAlign.Center,
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.graphicsLayer { translationY = -350f }
        )
        Spacer(modifier = Modifier.weight(0.8f))

        Text(
            text = "Discover, shop, and unlock exclusive Nike\nsneakers tailored just for you.", textAlign = TextAlign.Center,
            fontSize = 18.sp,
            modifier = Modifier.graphicsLayer { translationY = -350f }
        )
        Spacer(modifier = Modifier.weight(1f))

        IconButton(
            onClick = onNavigateToMain,
            modifier = Modifier
                .size(48.dp)
                .graphicsLayer { translationY = -200f }
        ) {
            Icon(
                imageVector = Icons.Default.ArrowForward,
                contentDescription = "Next",
                modifier = Modifier
                    .size(48.dp)
                    .clip(CircleShape)
                    .background(buttonColor)
                    .padding(8.dp),
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun OnBoardingPreview() {
    OnBoarding()
}
