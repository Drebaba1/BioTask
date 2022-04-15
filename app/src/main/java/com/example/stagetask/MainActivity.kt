package com.example.stagetask

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val moreButton: Button = findViewById(R.id.button)
        moreButton.setOnClickListener { showElements() }
    }

    private fun showElements() {
        val detail = arrayListOf("Hardworking", "Lazy", "Somewhat Lazy", "Very Lazy", "Dedicated")
        val detailView = detail.random()

        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = detailView
    }
}