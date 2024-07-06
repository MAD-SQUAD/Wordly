package com.example.wordly

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class WinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val sharedPreferences = getSharedPreferences("AppSettings", Context.MODE_PRIVATE)
        val isDarkTheme = sharedPreferences.getBoolean("isDarkTheme", true)
        setAppTheme(isDarkTheme)
        setContentView(R.layout.activity_win)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val arguments = intent.extras
        if (arguments != null) {
            val word = arguments.getString("win")
            val word_win: TextView = findViewById(R.id.textView2)
            word_win.text = "Загаданное слово: $word"
        }
        val button_play: Button = findViewById(R.id.button_play)
        button_play.setOnClickListener {
            val intent = Intent(this, GameActivity::class.java)
            startActivity(intent)
        }
        val button_menu: Button = findViewById(R.id.button_menu)
        button_menu.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
    private fun setAppTheme(isDark: Boolean) {
        if (isDark) {
            setTheme(R.style.AppTheme_Dark)
        } else {
            setTheme(R.style.AppTheme_Light)
        }
    }
}