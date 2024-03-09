package com.korea.history.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.sp
import com.korea.history.MR
import dev.icerock.moko.resources.compose.fontFamilyResource

private val pretendardStyle = TextStyle(
    letterSpacing = TextUnit(-0.02f, TextUnitType.Sp),
    lineHeightStyle = LineHeightStyle(
        alignment = LineHeightStyle.Alignment.Center,
        trim = LineHeightStyle.Trim.None,
    ),
    color = Wussu_Black,
)

private val pretendardBoldStyle = pretendardStyle.copy(
    fontWeight = FontWeight.Bold,
)

private val pretendardSemiBoldStyle = pretendardStyle.copy(
    fontWeight = FontWeight.SemiBold,
)

private val pretendardRegularStyle = pretendardStyle.copy(
    fontWeight = FontWeight.Normal,
)

@Composable
fun displayL(): TextStyle = pretendardBoldStyle.copy(
    fontSize = 28.sp,
    lineHeight = 40.sp,
    fontFamily = fontFamilyResource(MR.fonts.Pretendard.bold),
)

@Composable
fun displayM(): TextStyle = pretendardBoldStyle.copy(
    fontSize = 24.sp,
    lineHeight = 34.sp,
    fontFamily = fontFamilyResource(MR.fonts.Pretendard.bold),
)

@Composable
fun headlineL(): TextStyle = pretendardBoldStyle.copy(
    fontSize = 20.sp,
    lineHeight = 28.sp,
    fontFamily = fontFamilyResource(MR.fonts.Pretendard.bold),
)

@Composable
fun headlineM(): TextStyle = pretendardBoldStyle.copy(
    fontSize = 18.sp,
    lineHeight = 25.sp,
    fontFamily = fontFamilyResource(MR.fonts.Pretendard.bold),
)

@Composable
fun headlineS(): TextStyle = pretendardBoldStyle.copy(
    fontSize = 16.sp,
    lineHeight = 22.sp,
    fontFamily = fontFamilyResource(MR.fonts.Pretendard.bold),
)

@Composable
fun labelL(): TextStyle = pretendardSemiBoldStyle.copy(
    fontSize = 16.sp,
    lineHeight = 22.sp,
    fontFamily = fontFamilyResource(MR.fonts.Pretendard.semiBold),
)

@Composable
fun labelM(): TextStyle = pretendardSemiBoldStyle.copy(
    fontSize = 14.sp,
    lineHeight = 20.sp,
    fontFamily = fontFamilyResource(MR.fonts.Pretendard.semiBold),
)

@Composable
fun labelS(): TextStyle = pretendardSemiBoldStyle.copy(
    fontSize = 11.sp,
    lineHeight = 15.sp,
    fontFamily = fontFamilyResource(MR.fonts.Pretendard.semiBold),
)

@Composable
fun bodyL(): TextStyle = pretendardRegularStyle.copy(
    fontSize = 16.sp,
    lineHeight = 22.sp,
    fontFamily = fontFamilyResource(MR.fonts.Pretendard.regular),
)

@Composable
fun bodyM(): TextStyle = pretendardRegularStyle.copy(
    fontSize = 14.sp,
    lineHeight = 20.sp,
    fontFamily = fontFamilyResource(MR.fonts.Pretendard.regular),
)

@Composable
fun bodyS(): TextStyle = pretendardRegularStyle.copy(
    fontSize = 12.sp,
    lineHeight = 17.sp,
    fontFamily = fontFamilyResource(MR.fonts.Pretendard.regular),
)

@Composable
fun bodyS2(): TextStyle = pretendardRegularStyle.copy(
    fontSize = 11.sp,
    lineHeight = 15.sp,
    fontFamily = fontFamilyResource(MR.fonts.Pretendard.regular),
)
