package com.example.wordly

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

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

        val playGame: Button = findViewById(R.id.play_button)
        val helpButton: ImageView = findViewById(R.id.help_view)
        val settingButton: ImageView = findViewById(R.id.setting_view)
        val historyButton: ImageView = findViewById(R.id.histoy_view)

        helpButton.setOnClickListener{
            val intent = Intent(this, HelpActivity::class.java)
            startActivity(intent)
        }

        playGame.setOnClickListener{
            val intent = Intent(this, GameActivity::class.java)
            startActivity(intent)
        }

        settingButton.setOnClickListener{
            val intent = Intent(this, SettingActivity::class.java)
            startActivity(intent)
        }

        historyButton.setOnClickListener{
            val intent = Intent(this, HistoryActivity::class.java)
            startActivity(intent)
        }
    }
}