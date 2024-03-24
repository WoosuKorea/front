package com.korea.history.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.korea.history.MR
import com.korea.history.theme.Gray200
import com.korea.history.theme.Gray300
import com.korea.history.theme.Gray800
import com.korea.history.theme.Primary
import com.korea.history.theme.PrimaryLight
import com.korea.history.theme.headlineS
import com.korea.history.theme.labelM
import com.korea.history.theme.labelS
import dev.icerock.moko.resources.compose.painterResource

@Composable
fun CompletionGaugeRice(
    modifier: Modifier,
) {
    Column(
        modifier = modifier
            .background(Gray800, shape = RoundedCornerShape(16.dp))
            .padding(horizontal = 24.dp, vertical = 14.dp)
            .fillMaxHeight(),
    ) {
        Text(
            text = "노비",
            color = Gray200,
            style = headlineS(),
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = "신분 상승까지 밥 7그릇 더",
                color = Gray300,
                style = labelM(),
            )
            Spacer(Modifier.width(2.dp))
            Image(
                modifier = Modifier
                    .height(14.dp)
                    .width(14.dp),
                painter = painterResource(MR.images.icon_next),
                contentDescription = null,
            )
            Spacer(Modifier.width(10.dp))
            Box(
                modifier = Modifier
                    .height(23.dp)
                    .width(38.dp)
                    .background(color = PrimaryLight, shape = RoundedCornerShape(8.dp)),
            ) {
                Text(
                    modifier = Modifier.align(Alignment.Center),
                    text = "0 / 7",
                    color = Primary,
                    style = labelS(),
                    textAlign = TextAlign.Center,
                )
            }
        }
    }
}
