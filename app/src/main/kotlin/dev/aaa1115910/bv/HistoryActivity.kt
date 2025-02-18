package dev.aaa1115910.bv

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dev.aaa1115910.bv.screen.user.HistoryScreen
import dev.aaa1115910.bv.ui.theme.BVTheme

class HistoryActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BVTheme {
                HistoryScreen()
            }
        }
    }
}
