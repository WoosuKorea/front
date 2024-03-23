package com.korea.history.ui.home

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.korea.history.MR
import com.korea.history.theme.Gray400
import com.korea.history.theme.SubCoin
import com.korea.history.theme.SubColor
import com.korea.history.utils.WussuChip
import com.korea.history.utils.WussuChipContent

@Composable
fun MyQuizInfo(
    modifier: Modifier,
) {
    Row(modifier = modifier) {
        WussuChip(
            modifier = Modifier
                .height(41.dp)
                .width(77.dp)
                .padding(top = 11.dp),
        ) {
            WussuChipContent(
                modifier = Modifier.align(Alignment.Center),
                image = MR.images.icon_calendar,
                text = "4일차",
                textColor = SubColor,
            )
        }
        Spacer(Modifier.width(8.dp))
        WussuChip(
            modifier = Modifier
                .height(41.dp)
                .width(77.dp)
                .padding(top = 11.dp),
        ) {
            WussuChipContent(
                modifier = Modifier.align(Alignment.Center),
                image = MR.images.icon_spoon,
                text = "0그릇",
                textColor = Gray400,
            )
        }
        Spacer(Modifier.width(8.dp))
        WussuChip(
            modifier = Modifier
                .height(41.dp)
                .width(97.dp)
                .padding(top = 11.dp, end = 20.dp),
        ) {
            WussuChipContent(
                modifier = Modifier.align(Alignment.Center),
                image = MR.images.icon_coin,
                text = "0냥",
                textColor = SubCoin,
            )
        }
    }
}