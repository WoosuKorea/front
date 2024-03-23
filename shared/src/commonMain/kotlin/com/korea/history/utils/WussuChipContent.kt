package com.korea.history.utils

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.korea.history.theme.labelM
import dev.icerock.moko.resources.ImageResource
import dev.icerock.moko.resources.compose.painterResource

@Composable
fun WussuChipContent(
    modifier: Modifier,
    image: ImageResource,
    text: String,
    textColor: Color,
) {
    Row(
        modifier,
    ) {
        Image(
            modifier = Modifier
                .height(18.dp)
                .width(18.dp),
            painter = painterResource(image),
            contentDescription = null,
        )
        Spacer(Modifier.width(4.dp))
        Text(
            text = text,
            color = textColor,
            style = labelM(),
            textAlign = TextAlign.Center,
        )
    }
}