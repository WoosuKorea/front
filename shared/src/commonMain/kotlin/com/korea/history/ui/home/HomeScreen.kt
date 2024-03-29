package com.korea.history.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.korea.history.MR
import com.korea.history.getPlatformName
import com.korea.history.navigation.HomeScreenComponent
import com.korea.history.theme.BackGround
import com.korea.history.utils.WussuChip
import dev.icerock.moko.resources.compose.painterResource

@Composable
fun HomeScreen(home: HomeScreenComponent) {
    Box(
        modifier = Modifier
            .background(BackGround)
            .fillMaxSize(),
    ) {
        HomeImage(Modifier.align(Alignment.Center))
        val topMargin = if (getPlatformName() == "IOS") 61.dp else 11.dp
        val height = if (getPlatformName() == "IOS") 91.dp else 41.dp
        WussuChip(
            modifier = Modifier
                .height(height)
                .width(50.dp)
                .padding(start = 20.dp, top = topMargin),
        ) {
            Image(
                modifier = Modifier
                    .height(18.dp)
                    .width(18.dp)
                    .align(Alignment.Center),
                painter = painterResource(MR.images.icon_menu),
                contentDescription = null,
            )
        }

        MyQuizInfo(Modifier.align(Alignment.TopEnd))

        BottomRice(Modifier.align(Alignment.BottomCenter))
        TodayQuizButton(
            Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 151.dp),
        )
    }
}
