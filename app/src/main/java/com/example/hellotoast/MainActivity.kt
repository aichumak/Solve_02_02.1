package com.example.hellotoast

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var mCount = 0
    private lateinit var mShowCount: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mShowCount = findViewById(R.id.show_count)
    }

    fun sayHello(view: View) {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra(Intent.EXTRA_TEXT, mCount.toString())
        startActivity(intent)
    }

    fun countUp(view: View) {
        mCount++
        mShowCount.text = mCount.toString()
    }

}