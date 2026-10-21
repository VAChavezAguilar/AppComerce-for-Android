package pe.isil.appcomerce

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import pe.isil.appcomerce.core.desingsystems.theme.AppComerceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppComerceTheme(dynamicColor = false) {
                AppNavHost()
            }
        }
    }
}