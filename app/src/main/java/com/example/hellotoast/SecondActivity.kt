package com.example.hellotoast

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    private lateinit var textViewCount: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        initViews()
        setViewsValues()
    }

    private fun initViews() {
        textViewCount = findViewById(R.id.textViewCount)
    }

    private fun setViewsValues() {
        textViewCount.text = intent.getStringExtra(Intent.EXTRA_TEXT)
    }

}