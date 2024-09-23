package br.com.imgurcats

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import br.com.imgurcats.ui.composable.ImgurScreen
import br.com.imgurcats.ui.theme.ImgurCatsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ImgurCatsTheme {
                ImgurScreen()
            }
        }
    }
}
