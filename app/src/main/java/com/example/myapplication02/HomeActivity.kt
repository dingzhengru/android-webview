package com.example.myapplication02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val myWebView: WebView = findViewById(R.id.myWebView)
        myWebView.loadUrl("https://www.google.com")
    }
}