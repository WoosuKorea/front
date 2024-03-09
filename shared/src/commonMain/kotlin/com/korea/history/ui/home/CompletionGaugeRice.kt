package com.korea.history.ui.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.korea.history.theme.Gray200
import com.korea.history.theme.Gray300
import com.korea.history.theme.Gray800
import com.korea.history.theme.headlineS
import com.korea.history.theme.labelM

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

        Text(
            text = "신분 상승까지 밥 7그릇 더",
            color = Gray300,
            style = labelM()
        )
    }
}
