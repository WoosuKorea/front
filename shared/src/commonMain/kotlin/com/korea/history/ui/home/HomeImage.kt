package com.korea.history.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.korea.history.MR
import com.korea.history.theme.Gray300
import com.korea.history.theme.Wussu_White
import com.korea.history.theme.labelL
import dev.icerock.moko.resources.compose.painterResource

@Composable
fun HomeImage(
    modifier: Modifier,
) {
    Box(
        modifier = modifier.width(250.dp),
    ) {
        Box(
            modifier = Modifier
                .height(46.dp)
                .fillMaxWidth()
                .align(Alignment.TopCenter)
                .background(color = Wussu_White, shape = RoundedCornerShape(16.dp)),
        ) {
            Text(
                modifier = Modifier.align(Alignment.Center),
                text = "괜찮소.. 풀뿌리라도 뜯어먹겠소..",
                color = Gray300,
                style = labelL(),
            )
        }
        Image(
            modifier = Modifier
                .height(56.dp)
                .width(25.dp)
                .align(Alignment.TopCenter)
                .padding(top = 34.dp),
            painter = painterResource(MR.images.icon_polygon),
            contentDescription = null,
        )
        Image(
            modifier = Modifier
                .height(280.dp)
                .width(260.dp)
                .padding(top = 20.dp)
                .align(Alignment.TopCenter),
            painter = painterResource(MR.images.image_slave),
            contentDescription = null,
        )
    }
}
