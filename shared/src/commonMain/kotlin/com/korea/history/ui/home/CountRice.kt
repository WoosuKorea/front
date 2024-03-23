package com.korea.history.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.korea.history.MR
import com.korea.history.theme.Gray300
import com.korea.history.theme.Gray800
import com.korea.history.theme.labelM
import dev.icerock.moko.resources.compose.painterResource

@Composable
fun CountRice(
    modifier: Modifier,
) {
    Box(
        modifier = modifier
            .background(Gray800, shape = RoundedCornerShape(16.dp))
            .fillMaxHeight(),
        contentAlignment = Alignment.Center,
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                modifier = Modifier
                    .height(43.dp)
                    .width(43.dp),
                painter = painterResource(MR.images.image_rice),
                contentDescription = null,
            )

            Spacer(Modifier.height(2.dp))
            Text(
                text = "0",
                style = labelM(),
                color = Gray300,
            )
        }
    }
}
