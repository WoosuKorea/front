package com.korea.history.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.korea.history.MR
import com.korea.history.theme.Primary
import com.korea.history.theme.Wussu_White
import com.korea.history.theme.headlineM
import dev.icerock.moko.resources.compose.painterResource

@Composable
fun TodayQuizButton(
    modifier: Modifier,
) {
    Box(
        modifier = modifier
            .width(286.dp)
            .height(58.dp)
            .background(color = Primary, shape = RoundedCornerShape(29.dp)),
        contentAlignment = Alignment.Center,
    ) {
        Row {
            Text(
                text = "오늘 퀴즈 풀기",
                color = Wussu_White,
                style = headlineM(),
            )
            Spacer(Modifier.width(10.dp))
            Image(
                modifier = Modifier
                    .height(26.dp)
                    .width(26.dp),
                painter = painterResource(MR.images.image_rice_light),
                contentDescription = null,
            )
        }
    }
}
