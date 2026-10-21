package pe.isil.appcomerce.features.home.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import pe.isil.appcomerce.core.favorite
import pe.isil.appcomerce.core.favoriteOutlined
import pe.isil.appcomerce.features.home.domain.Product

@Composable
fun ProductCard(
    product: Product,
    isFavorite: Boolean,
    onToggleFavorite: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Box {
            Column(modifier = Modifier.padding(8.dp)) {
                AsyncImage(
                    model = product.imagen,
                    contentDescription = "Imagen producto",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = product.marca,
                    fontWeight = FontWeight.Bold,
                    maxLines = 1
                )
                Text(
                    text = product.nombre,
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colorScheme.primary
                )
                Text(
                    text = "⭐: ${product.calificacion}",
                    style = MaterialTheme.typography.bodyMedium
                )
                Text(
                    text = product.precio,
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colorScheme.primary
                )
            }
            IconButton(
                onClick = onToggleFavorite,
                modifier = Modifier.align(Alignment.TopEnd),
                colors = IconButtonDefaults.iconButtonColors(
                    contentColor = MaterialTheme.colorScheme.primary,
                    containerColor = MaterialTheme.colorScheme.onPrimary
                )
            ) {
                Icon(
                    imageVector = if (isFavorite) favorite else favoriteOutlined,
                    contentDescription = "favorite"
                )
            }
        }
    }
}
