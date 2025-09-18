package com.example.twice

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ImageInsideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_inside)

        val getData = intent.getStringExtra("data")

//        Toast.makeText(this, getData, Toast.LENGTH_LONG).show()

        val memberImage = findViewById<ImageView>(R.id.memberImageArea)


         val resId: Int = when (getData) {
            "1" -> R.drawable.member_1;
            "2" -> R.drawable.member_2
            "3" -> R.drawable.member_3
            "4" -> R.drawable.member_4
            "5" -> R.drawable.member_5
            "6" -> R.drawable.member_6
            "7" -> R.drawable.member_7
            "8" -> R.drawable.member_8
            "9" -> R.drawable.member_9
             else -> R.drawable.member_1
        }

        memberImage.setImageResource(resId)





    }
}