package com.korea.history.image.iconpack

import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.korea.history.image.IconPack

public val IconPack.IconRiceBig: ImageVector
    get() {
        if (_iconRiceBig != null) {
            return _iconRiceBig!!
        }
        _iconRiceBig = Builder(name = "IconRiceBig", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            group {
                path(fill = null, stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(-14.0f, -24.0f)
                    horizontalLineToRelative(76.0f)
                    verticalLineToRelative(76.0f)
                    horizontalLineToRelative(-76.0f)
                    close()
                }
            }
        }
        .build()
        return _iconRiceBig!!
    }

private var _iconRiceBig: ImageVector? = null
