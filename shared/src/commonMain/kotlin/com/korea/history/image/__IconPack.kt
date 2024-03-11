package com.korea.history.image

import androidx.compose.ui.graphics.vector.ImageVector
import com.korea.history.image.iconpack.IconRiceBig
import com.korea.history.image.iconpack.IconRiceSmall
import kotlin.collections.List as ____KtList

public object IconPack

private var __AllIcons: ____KtList<ImageVector>? = null

public val IconPack.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(IconRiceSmall, IconRiceBig)
    return __AllIcons!!
  }
