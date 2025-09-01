package com.example.sample4_10

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.net.URL

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var web1: WebView = findViewById(R.id.web1)
        web1.webViewClient = WebViewClient()
        web1.loadUrl("https://www.google.com")
        web1.settings.javaScriptEnabled = true
        web1.settings.domStorageEnabled = true


        val btn1 = findViewById<Button>(R.id.button)
        btn1.setOnClickListener {
            Toast.makeText(this@MainActivity, "클릭", Toast.LENGTH_SHORT).show()
            web1.loadUrl("https://m.topics.seoul.go.kr/")
        }


    }
}