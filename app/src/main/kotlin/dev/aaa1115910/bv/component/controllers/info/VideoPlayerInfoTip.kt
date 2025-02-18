package dev.aaa1115910.bv.component.controllers.info

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import dev.aaa1115910.bv.component.formatMinSec

@Composable
fun VideoPlayerInfoTip(
    modifier: Modifier = Modifier,
    data: VideoPlayerInfoData
) {
    Surface(
        modifier = modifier
            .padding(8.dp),
        color = Color.Black.copy(alpha = 0.4f),
        shape = MaterialTheme.shapes.medium
    ) {
        Column {
            Text(text = "视频长度: ${data.totalDuration.formatMinSec()}")
            Text(text = "当前时间: ${data.currentTime.formatMinSec()}")
            Text(text = "缓冲进度: ${data.bufferedPercentage}%")
            Text(text = "分辨率: ${data.resolutionWidth} x ${data.resolutionHeight}")
        }
    }
}

data class VideoPlayerInfoData(
    val totalDuration: Long,
    val currentTime: Long,
    val bufferedPercentage: Int,
    val resolutionWidth: Int,
    val resolutionHeight: Int
)