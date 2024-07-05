package com.example.wordly

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SettingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val sharedPreferences = getSharedPreferences("AppSettings", Context.MODE_PRIVATE)
        val isDarkTheme = sharedPreferences.getBoolean("isDarkTheme", true)
        setAppTheme(isDarkTheme)

        enableEdgeToEdge()
        setContentView(R.layout.activity_setting)

        val resultIntent = Intent()
        setResult(Activity.RESULT_OK, resultIntent)

//        val backButton: ImageView = findViewById(R.id.back)
        val radioButtonDark: RadioButton = findViewById(R.id.radioButtonDark)
        val radioButtonLight: RadioButton = findViewById(R.id.radioButtonLight)

        radioButtonDark.isChecked = isDarkTheme
        radioButtonLight.isChecked = !isDarkTheme

        radioButtonDark.setOnClickListener {
            saveThemePreference(true)
            this.recreate()
        }

        radioButtonLight.setOnClickListener {
            saveThemePreference(false)
            this.recreate()
        }

//        backButton.setOnClickListener {
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
//        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }


    private fun saveThemePreference(isDark: Boolean) {
        val sharedPreferences = getSharedPreferences("AppSettings", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putBoolean("isDarkTheme", isDark)
        editor.apply()
    }

    private fun setAppTheme(isDark: Boolean) {
        if (isDark) {
            setTheme(R.style.AppTheme_Dark)
        } else {
            setTheme(R.style.AppTheme_Light)
        }
    }

}