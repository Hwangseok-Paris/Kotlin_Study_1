package com.example.twice

import android.content.Intent
import android.os.Bundle
import android.view.animation.LinearInterpolator
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

@Suppress("DEPRECATION")
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
//
//        Handler().postDelayed({
//            startActivity(Intent(this, MainActivity::class.java))
//        }, 4000)



        val splashImage = findViewById<ImageView>(R.id.splashImage)

        splashImage.post {
            val d = splashImage.drawable ?: return@post
            val vw = splashImage.width.toFloat()
            val vh = splashImage.height.toFloat()
            val iw = d.intrinsicWidth.toFloat()
            val ih = d.intrinsicHeight.toFloat()
            if (iw <= 0f || ih <= 0f || vh <= 0f) return@post

            // 1) 세로 꽉 차게 스케일
            val scale = vh / ih
            val shownWidth = iw * scale
            val move = shownWidth - vw
            if (move <= 0f) return@post

            // 2) 시작 매트릭스(세로 중앙 정렬, 가로 왼쪽부터 시작)
            val base = android.graphics.Matrix().apply {
                setScale(scale, scale)
                postTranslate(0f, (vh - ih * scale) / 2f)
            }
            splashImage.imageMatrix = base

            // 3) 좌 -> 우 끝까지 패닝 (원하면 REVERSE로 왕복)
            val animator = android.animation.ValueAnimator.ofFloat(0f, -move).apply {
                duration = 3000L
                startDelay = 500L

                interpolator = LinearInterpolator()
                addUpdateListener { va ->
                    val tx = va.animatedValue as Float
                    splashImage.imageMatrix = android.graphics.Matrix(base).apply {
                        postTranslate(tx, 0f)
                    }
                }

                addListener(object : android.animation.AnimatorListenerAdapter() {
                    override fun onAnimationEnd(animation: android.animation.Animator) {

                        splashImage.postDelayed({
                            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                            // 선택: 페이드 전환 원하면 다음 라인 활성화
                             overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
                            finish()
                        }, 500L)
                    }
                })
                // repeatCount = android.animation.ValueAnimator.INFINITE
                // repeatMode = android.animation.ValueAnimator.REVERSE

                start()
            }
        }
    }
}