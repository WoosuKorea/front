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
import com.korea.history.theme.Gray800
import com.korea.history.theme.Wussu_White

@Composable
fun BottomRice(
    modifier: Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(154.dp)
            .background(color = Wussu_White, shape = RoundedCornerShape(topEnd = 28.dp, topStart = 28.dp)),
        contentAlignment = Alignment.BottomCenter,
    ) {
        Row(
            modifier = Modifier
                .padding(horizontal = 20.dp, vertical = 16.dp)
                .fillMaxWidth()
                .height(93.dp),
        ) {
            CompletionGaugeRice(Modifier.weight(3f))

            Spacer(
                modifier = Modifier
                    .width(8.dp)
                    .fillMaxHeight(),
            )

            Box(
                modifier = Modifier
                    .background(Gray800, shape = RoundedCornerShape(16.dp))
                    .weight(1f)
                    .fillMaxHeight(),
            ) {
            }
        }
    }
}
