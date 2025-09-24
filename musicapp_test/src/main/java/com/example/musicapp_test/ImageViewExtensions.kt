package com.example.musicapp_test

import android.graphics.Matrix
import android.widget.ImageView
import androidx.core.view.doOnLayout

fun ImageView?.setTopCrop() {
    val imgView = this ?: return

    imgView.doOnLayout {
        val drawable = imgView.drawable ?: return@doOnLayout // drawable이 없으면 종료
        val viewWidth = imgView.width.toFloat()
        val viewHeight = imgView.height.toFloat()

        // 원본 이미지의 크기
        val drawableWidth = drawable.intrinsicWidth.toFloat()
        val drawableHeight = drawable.intrinsicHeight.toFloat()

        val scaleW = viewWidth / drawableWidth
        val scaleH = viewHeight / drawableHeight

        val scale = maxOf(scaleW, scaleH)

        val scaledWidth = drawableWidth * scale
        val scaledHeight = drawableHeight * scale

        // dx: 수평 이동 거리 (수평 중앙 정렬)
        // 꽉 채운 후 남는 여백을 중앙에 나누어 줌
        val dx = (viewWidth - scaledWidth) * 0.5f

        // dy: 수직 이동 거리 (상단 정렬)
        // 상단에 고정해야 하므로 dy는 항상 0입니다.
        val dy = 0f

        // Matrix 적용
        val matrix = Matrix()
        matrix.setScale(scale, scale)
        matrix.postTranslate(dx, dy) // dx, dy만큼 이동
        imgView.imageMatrix = matrix
    }


}