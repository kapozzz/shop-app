package com.example.shop_app.presentation.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

object ShopAppType {

    val titleMedium = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Light,
        fontSize = 18.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.5.sp
    )

    val titleMediumBold = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 18.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.5.sp
    )

    val titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 22.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.7.sp
    )

}