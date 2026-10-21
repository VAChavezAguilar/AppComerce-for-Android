package pe.isil.appcomerce.core

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

object Icons {
    object Default {
        private var _arrowForward: ImageVector? = null

        val ArrowForward: ImageVector
            get() {
                if (_arrowForward != null) {
                    return _arrowForward!!
                }
                _arrowForward = ImageVector.Builder(
                    name = "ArrowForward",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f
                ).apply {
                    path(
                        fill = SolidColor(Color.Black),
                        fillAlpha = 1.0f,
                        stroke = null,
                        strokeAlpha = 1.0f,
                        strokeLineWidth = 1.0f,
                        strokeLineCap = StrokeCap.Butt,
                        strokeLineJoin = StrokeJoin.Miter,
                        strokeLineMiter = 1.0f,
                        pathFillType = PathFillType.NonZero
                    ) {
                        moveTo(12f, 4f)
                        lineTo(10.59f, 5.41f)
                        lineTo(16.17f, 11f)
                        lineTo(4f, 11f)
                        lineTo(4f, 13f)
                        lineTo(16.17f, 13f)
                        lineTo(10.59f, 18.59f)
                        lineTo(12f, 20f)
                        lineTo(20f, 12f)
                        close()
                    }
                }.build()
                return _arrowForward!!
            }
    }
}

@Suppress("CheckReturnValue")
val notifications: ImageVector
    get() {
        if (_notifications != null) {
            return _notifications!!
        }
        _notifications =
            ImageVector.Builder(
                name = "notifications",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
            )
                .apply {
                    path(
                        fill = SolidColor(Color.Black),
                        fillAlpha = 1f,
                        stroke = null,
                        strokeAlpha = 1f,
                        strokeLineWidth = 1f,
                        strokeLineCap = StrokeCap.Butt,
                        strokeLineJoin = StrokeJoin.Bevel,
                        strokeLineMiter = 1f,
                        pathFillType = PathFillType.NonZero,
                    ) {
                        moveTo(4f, 19f)
                        verticalLineTo(17f)
                        horizontalLineTo(6f)
                        verticalLineTo(10f)
                        quadTo(6f, 7.93f, 7.25f, 6.31f)
                        reflectiveQuadTo(10.5f, 4.2f)
                        verticalLineTo(3.5f)
                        quadToRelative(0f, -0.63f, 0.44f, -1.06f)
                        reflectiveQuadTo(12f, 2f)
                        reflectiveQuadToRelative(1.06f, 0.44f)
                        reflectiveQuadTo(13.5f, 3.5f)
                        verticalLineTo(4.2f)
                        quadToRelative(2f, 0.5f, 3.25f, 2.11f)
                        reflectiveQuadTo(18f, 10f)
                        verticalLineToRelative(7f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(4f)
                        close()
                        moveToRelative(8f, -7.5f)
                        close()
                        moveTo(12f, 22f)
                        quadToRelative(-0.82f, 0f, -1.41f, -0.59f)
                        reflectiveQuadTo(10f, 20f)
                        horizontalLineToRelative(4f)
                        quadToRelative(0f, 0.82f, -0.59f, 1.41f)
                        reflectiveQuadTo(12f, 22f)
                        close()
                        moveTo(8f, 17f)
                        horizontalLineToRelative(8f)
                        verticalLineTo(10f)
                        quadTo(16f, 8.35f, 14.83f, 7.18f)
                        reflectiveQuadTo(12f, 6f)
                        reflectiveQuadTo(9.18f, 7.18f)
                        reflectiveQuadTo(8f, 10f)
                        verticalLineToRelative(7f)
                        close()
                    }
                }
                .build()
        return _notifications!!
    }

private var _notifications: ImageVector? = null

@Suppress("CheckReturnValue")
val favoriteOutlined: ImageVector
    get() {
        if (_favoriteOutlined != null) {
            return _favoriteOutlined!!
        }
        _favoriteOutlined =
            ImageVector.Builder(
                name = "favorite",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
            )
                .apply {
                    path(
                        fill = SolidColor(Color.Black),
                        fillAlpha = 1f,
                        stroke = null,
                        strokeAlpha = 1f,
                        strokeLineWidth = 1f,
                        strokeLineCap = StrokeCap.Butt,
                        strokeLineJoin = StrokeJoin.Bevel,
                        strokeLineMiter = 1f,
                        pathFillType = PathFillType.NonZero,
                    ) {
                        moveTo(12f, 21f)
                        lineTo(10.55f, 19.7f)
                        quadTo(8.03f, 17.43f, 6.38f, 15.78f)
                        quadTo(4.73f, 14.13f, 3.75f, 12.81f)
                        quadTo(2.78f, 11.5f, 2.39f, 10.4f)
                        reflectiveQuadTo(2f, 8.15f)
                        quadTo(2f, 5.8f, 3.58f, 4.22f)
                        reflectiveQuadTo(7.5f, 2.65f)
                        quadToRelative(1.3f, 0f, 2.48f, 0.55f)
                        reflectiveQuadTo(12f, 4.75f)
                        quadToRelative(0.85f, -1f, 2.03f, -1.55f)
                        reflectiveQuadTo(16.5f, 2.65f)
                        quadToRelative(2.35f, 0f, 3.93f, 1.57f)
                        reflectiveQuadTo(22f, 8.15f)
                        quadTo(22f, 9.3f, 21.61f, 10.4f)
                        reflectiveQuadToRelative(-1.36f, 2.41f)
                        quadToRelative(-0.97f, 1.31f, -2.63f, 2.96f)
                        quadToRelative(-1.65f, 1.65f, -4.17f, 3.92f)
                        lineTo(12f, 21f)
                        close()
                        moveToRelative(0f, -2.7f)
                        quadToRelative(2.4f, -2.15f, 3.95f, -3.69f)
                        reflectiveQuadTo(18.4f, 11.94f)
                        reflectiveQuadTo(19.65f, 9.91f)
                        quadTo(20f, 9.02f, 20f, 8.15f)
                        quadToRelative(0f, -1.5f, -1f, -2.5f)
                        reflectiveQuadToRelative(-2.5f, -1f)
                        quadToRelative(-1.17f, 0f, -2.17f, 0.66f)
                        quadTo(13.33f, 5.97f, 12.95f, 7f)
                        horizontalLineToRelative(-1.9f)
                        quadTo(10.68f, 5.97f, 9.68f, 5.31f)
                        reflectiveQuadTo(7.5f, 4.65f)
                        quadTo(6f, 4.65f, 5f, 5.65f)
                        reflectiveQuadTo(4f, 8.15f)
                        quadTo(4f, 9.02f, 4.35f, 9.91f)
                        reflectiveQuadTo(5.6f, 11.94f)
                        reflectiveQuadToRelative(2.45f, 2.67f)
                        reflectiveQuadTo(12f, 18.3f)
                        close()
                        moveToRelative(0f, -6.83f)
                        close()
                    }
                }
                .build()
        return _favoriteOutlined!!
    }

private var _favoriteOutlined: ImageVector? = null

@Suppress("CheckReturnValue")
val favorite: ImageVector
    get() {
        if (_favorite != null) {
            return _favorite!!
        }
        _favorite =
            ImageVector.Builder(
                name = "favorite",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
            )
                .apply {
                    path(
                        fill = SolidColor(Color.Black),
                        fillAlpha = 1f,
                        stroke = null,
                        strokeAlpha = 1f,
                        strokeLineWidth = 1f,
                        strokeLineCap = StrokeCap.Butt,
                        strokeLineJoin = StrokeJoin.Bevel,
                        strokeLineMiter = 1f,
                        pathFillType = PathFillType.NonZero,
                    ) {
                        moveTo(12f, 21f)
                        lineTo(10.55f, 19.7f)
                        quadTo(8.03f, 17.43f, 6.38f, 15.78f)
                        quadTo(4.73f, 14.13f, 3.75f, 12.81f)
                        quadTo(2.78f, 11.5f, 2.39f, 10.4f)
                        reflectiveQuadTo(2f, 8.15f)
                        quadTo(2f, 5.8f, 3.58f, 4.22f)
                        reflectiveQuadTo(7.5f, 2.65f)
                        quadToRelative(1.3f, 0f, 2.48f, 0.55f)
                        reflectiveQuadTo(12f, 4.75f)
                        quadToRelative(0.85f, -1f, 2.03f, -1.55f)
                        reflectiveQuadTo(16.5f, 2.65f)
                        quadToRelative(2.35f, 0f, 3.93f, 1.57f)
                        reflectiveQuadTo(22f, 8.15f)
                        quadTo(22f, 9.3f, 21.61f, 10.4f)
                        reflectiveQuadToRelative(-1.36f, 2.41f)
                        quadToRelative(-0.97f, 1.31f, -2.63f, 2.96f)
                        quadToRelative(-1.65f, 1.65f, -4.17f, 3.92f)
                        lineTo(12f, 21f)
                        close()
                    }
                }
                .build()
        return _favorite!!
    }

private var _favorite: ImageVector? = null

@Suppress("CheckReturnValue")
val home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home =
            ImageVector.Builder(
                name = "home",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
            )
                .apply {
                    path(
                        fill = SolidColor(Color.Black),
                        fillAlpha = 1f,
                        stroke = null,
                        strokeAlpha = 1f,
                        strokeLineWidth = 1f,
                        strokeLineCap = StrokeCap.Butt,
                        strokeLineJoin = StrokeJoin.Bevel,
                        strokeLineMiter = 1f,
                        pathFillType = PathFillType.NonZero,
                    ) {
                        moveTo(4f, 21f)
                        verticalLineTo(9f)
                        lineTo(12f, 3f)
                        lineToRelative(8f, 6f)
                        verticalLineTo(21f)
                        horizontalLineTo(14f)
                        verticalLineTo(14f)
                        horizontalLineTo(10f)
                        verticalLineToRelative(7f)
                        horizontalLineTo(4f)
                        close()
                    }
                }
                .build()
        return _home!!
    }

private var _home: ImageVector? = null

@Suppress("CheckReturnValue")
val homeOutlined: ImageVector
    get() {
        if (_homeOutlined != null) {
            return _homeOutlined!!
        }
        _homeOutlined =
            ImageVector.Builder(
                name = "home",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
            )
                .apply {
                    path(
                        fill = SolidColor(Color.Black),
                        fillAlpha = 1f,
                        stroke = null,
                        strokeAlpha = 1f,
                        strokeLineWidth = 1f,
                        strokeLineCap = StrokeCap.Butt,
                        strokeLineJoin = StrokeJoin.Bevel,
                        strokeLineMiter = 1f,
                        pathFillType = PathFillType.NonZero,
                    ) {
                        moveTo(6f, 19f)
                        horizontalLineTo(9f)
                        verticalLineTo(13f)
                        horizontalLineToRelative(6f)
                        verticalLineToRelative(6f)
                        horizontalLineToRelative(3f)
                        verticalLineTo(10f)
                        lineTo(12f, 5.5f)
                        lineTo(6f, 10f)
                        verticalLineToRelative(9f)
                        close()
                        moveTo(4f, 21f)
                        verticalLineTo(9f)
                        lineTo(12f, 3f)
                        lineToRelative(8f, 6f)
                        verticalLineTo(21f)
                        horizontalLineTo(13f)
                        verticalLineTo(15f)
                        horizontalLineTo(11f)
                        verticalLineToRelative(6f)
                        horizontalLineTo(4f)
                        close()
                        moveToRelative(8f, -8.75f)
                        close()
                    }
                }
                .build()
        return _homeOutlined!!
    }

private var _homeOutlined: ImageVector? = null

@Suppress("CheckReturnValue")
val shopping_cart: ImageVector
    get() {
        if (_shopping_cart != null) {
            return _shopping_cart!!
        }
        _shopping_cart =
            ImageVector.Builder(
                name = "shopping_cart",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
            )
                .apply {
                    path(
                        fill = SolidColor(Color.Black),
                        fillAlpha = 1f,
                        stroke = null,
                        strokeAlpha = 1f,
                        strokeLineWidth = 1f,
                        strokeLineCap = StrokeCap.Butt,
                        strokeLineJoin = StrokeJoin.Bevel,
                        strokeLineMiter = 1f,
                        pathFillType = PathFillType.NonZero,
                    ) {
                        moveTo(5.59f, 21.41f)
                        quadTo(5f, 20.83f, 5f, 20f)
                        reflectiveQuadTo(5.59f, 18.59f)
                        reflectiveQuadTo(7f, 18f)
                        quadToRelative(0.83f, 0f, 1.41f, 0.59f)
                        quadTo(9f, 19.18f, 9f, 20f)
                        reflectiveQuadTo(8.41f, 21.41f)
                        quadTo(7.83f, 22f, 7f, 22f)
                        reflectiveQuadTo(5.59f, 21.41f)
                        close()
                        moveToRelative(10f, 0f)
                        quadTo(15f, 20.83f, 15f, 20f)
                        reflectiveQuadToRelative(0.59f, -1.41f)
                        reflectiveQuadTo(17f, 18f)
                        reflectiveQuadToRelative(1.41f, 0.59f)
                        quadTo(19f, 19.18f, 19f, 20f)
                        reflectiveQuadToRelative(-0.59f, 1.41f)
                        reflectiveQuadTo(17f, 22f)
                        reflectiveQuadTo(15.59f, 21.41f)
                        close()
                        moveTo(5.2f, 4f)
                        horizontalLineTo(19.95f)
                        quadToRelative(0.57f, 0f, 0.88f, 0.51f)
                        reflectiveQuadToRelative(0.02f, 1.04f)
                        lineToRelative(-3.55f, 6.4f)
                        quadToRelative(-0.27f, 0.5f, -0.74f, 0.78f)
                        reflectiveQuadTo(15.55f, 13f)
                        horizontalLineTo(8.1f)
                        lineTo(7f, 15f)
                        horizontalLineTo(19f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(7f)
                        quadTo(5.88f, 17f, 5.3f, 16.01f)
                        quadTo(4.73f, 15.03f, 5.25f, 14.05f)
                        lineTo(6.6f, 11.6f)
                        lineTo(3f, 4f)
                        horizontalLineTo(1f)
                        verticalLineTo(2f)
                        horizontalLineTo(4.25f)
                        lineTo(5.2f, 4f)
                        close()
                    }
                }
                .build()
        return _shopping_cart!!
    }

private var _shopping_cart: ImageVector? = null

@Suppress("CheckReturnValue")
val shopping_cartOutlined: ImageVector
    get() {
        if (_shopping_cartOutlined != null) {
            return _shopping_cartOutlined!!
        }
        _shopping_cartOutlined =
            ImageVector.Builder(
                name = "shopping_cart",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
            )
                .apply {
                    path(
                        fill = SolidColor(Color.Black),
                        fillAlpha = 1f,
                        stroke = null,
                        strokeAlpha = 1f,
                        strokeLineWidth = 1f,
                        strokeLineCap = StrokeCap.Butt,
                        strokeLineJoin = StrokeJoin.Bevel,
                        strokeLineMiter = 1f,
                        pathFillType = PathFillType.NonZero,
                    ) {
                        moveTo(5.59f, 21.41f)
                        quadTo(5f, 20.83f, 5f, 20f)
                        reflectiveQuadTo(5.59f, 18.59f)
                        reflectiveQuadTo(7f, 18f)
                        quadToRelative(0.83f, 0f, 1.41f, 0.59f)
                        quadTo(9f, 19.18f, 9f, 20f)
                        reflectiveQuadTo(8.41f, 21.41f)
                        quadTo(7.83f, 22f, 7f, 22f)
                        reflectiveQuadTo(5.59f, 21.41f)
                        close()
                        moveToRelative(10f, 0f)
                        quadTo(15f, 20.83f, 15f, 20f)
                        reflectiveQuadToRelative(0.59f, -1.41f)
                        reflectiveQuadTo(17f, 18f)
                        reflectiveQuadToRelative(1.41f, 0.59f)
                        quadTo(19f, 19.18f, 19f, 20f)
                        reflectiveQuadToRelative(-0.59f, 1.41f)
                        reflectiveQuadTo(17f, 22f)
                        reflectiveQuadTo(15.59f, 21.41f)
                        close()
                        moveTo(6.15f, 6f)
                        lineToRelative(2.4f, 5f)
                        horizontalLineToRelative(7f)
                        lineTo(18.3f, 6f)
                        horizontalLineTo(6.15f)
                        close()
                        moveTo(5.2f, 4f)
                        horizontalLineTo(19.95f)
                        quadToRelative(0.57f, 0f, 0.88f, 0.51f)
                        reflectiveQuadToRelative(0.02f, 1.04f)
                        lineToRelative(-3.55f, 6.4f)
                        quadToRelative(-0.27f, 0.5f, -0.74f, 0.78f)
                        reflectiveQuadTo(15.55f, 13f)
                        horizontalLineTo(8.1f)
                        lineTo(7f, 15f)
                        horizontalLineTo(19f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(7f)
                        quadTo(5.88f, 17f, 5.3f, 16.01f)
                        quadTo(4.73f, 15.03f, 5.25f, 14.05f)
                        lineTo(6.6f, 11.6f)
                        lineTo(3f, 4f)
                        horizontalLineTo(1f)
                        verticalLineTo(2f)
                        horizontalLineTo(4.25f)
                        lineTo(5.2f, 4f)
                        close()
                        moveToRelative(3.35f, 7f)
                        horizontalLineToRelative(7f)
                        horizontalLineToRelative(-7f)
                        close()
                    }
                }
                .build()
        return _shopping_cartOutlined!!
    }

private var _shopping_cartOutlined: ImageVector? = null
