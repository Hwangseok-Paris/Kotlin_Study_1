package com.example.goodwords

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.goodwords.databinding.ActivityMainBinding
import androidx.databinding.DataBindingUtil

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

//        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
//        binding.activity = this
//        val button = findViewById<Button>(R.id.showAllSentenceButton)
//
//        button.setOnClickListener {
//            val intent = Intent(this, SentenceActivity::class.java)
//            startActivity(intent)
//        }

//        데이터바인딩 계속 안됨 findViewById로 대체
        binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.showAllSentenceButton.setOnClickListener {
            var intent = Intent(this, SentenceActivity::class.java)
            startActivity(intent)
        }


    }

    // "전체 명언 보기" 버튼 클릭 시 호출될 함수
    fun onShowAllSentenceButtonClick() {
        val intent = Intent(this, SentenceActivity::class.java)
        startActivity(intent)
    }
}