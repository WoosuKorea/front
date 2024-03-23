package com.korea.history.ui.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.korea.history.theme.Wussu_White

@Composable
fun BottomRice(
    modifier: Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(180.dp)
            .background(color = Wussu_White, shape = RoundedCornerShape(topEnd = 28.dp, topStart = 28.dp)),
        contentAlignment = Alignment.BottomCenter,
    ) {
        Row(
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp, top = 42.dp)
                .fillMaxWidth()
                .align(Alignment.TopCenter)
                .height(93.dp),
        ) {
            CompletionGaugeRice(Modifier.weight(3f))

            Spacer(
                modifier = Modifier
                    .width(8.dp)
                    .fillMaxHeight(),
            )

            CountRice(Modifier.weight(1f))
        }
    }
}
