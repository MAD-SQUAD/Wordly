package com.example.wordly

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class GameActivity : AppCompatActivity() {

    val edit11: EditText = findViewById(R.id.edit_11)
    val edit12: EditText = findViewById(R.id.edit_12)
    val edit13: EditText = findViewById(R.id.edit_13)
    val edit14: EditText = findViewById(R.id.edit_14)
    val edit15: EditText = findViewById(R.id.edit_15)
    val edit21: EditText = findViewById(R.id.edit_21)
    val edit22: EditText = findViewById(R.id.edit_22)
    val edit23: EditText = findViewById(R.id.edit_23)
    val edit24: EditText = findViewById(R.id.edit_24)
    val edit25: EditText = findViewById(R.id.edit_25)
    val edit31: EditText = findViewById(R.id.edit_31)
    val edit32: EditText = findViewById(R.id.edit_32)
    val edit33: EditText = findViewById(R.id.edit_33)
    val edit34: EditText = findViewById(R.id.edit_34)
    val edit35: EditText = findViewById(R.id.edit_35)
    val edit41: EditText = findViewById(R.id.edit_41)
    val edit42: EditText = findViewById(R.id.edit_42)
    val edit43: EditText = findViewById(R.id.edit_43)
    val edit44: EditText = findViewById(R.id.edit_44)
    val edit45: EditText = findViewById(R.id.edit_45)
    val edit51: EditText = findViewById(R.id.edit_51)
    val edit52: EditText = findViewById(R.id.edit_52)
    val edit53: EditText = findViewById(R.id.edit_53)
    val edit54: EditText = findViewById(R.id.edit_54)
    val edit55: EditText = findViewById(R.id.edit_55)
    val edit61: EditText = findViewById(R.id.edit_61)
    val edit62: EditText = findViewById(R.id.edit_62)
    val edit63: EditText = findViewById(R.id.edit_63)
    val edit64: EditText = findViewById(R.id.edit_64)
    val edit65: EditText = findViewById(R.id.edit_65)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_game)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val backButton: ImageView = findViewById(R.id.back_view)
        val helpButton: ImageView = findViewById(R.id.help_view_game)
        val settingButton: ImageView = findViewById(R.id.setting_view_game)

        helpButton.setOnClickListener {
            val intent = Intent(this, HelpActivity::class.java)
            startActivity(intent)
        }

        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        settingButton.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            startActivity(intent)
        }

        // логика полей ввода

        edit15.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
                if (s?.length == 1) {
                    validateRow(
                        edit11,
                        edit12,
                        edit13,
                        edit14,
                        edit15
                    )
                }
            }
        })
        edit25.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
                if (s?.length == 1) {
                    validateRow(
                        edit21,
                        edit22,
                        edit23,
                        edit24,
                        edit25
                    )
                }
            }
        })

        edit35.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
                if (s?.length == 1) {
                    validateRow(
                        edit31,
                        edit32,
                        edit33,
                        edit34,
                        edit35
                    )
                }
            }
        })
        edit45.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
                if (s?.length == 1) {
                    validateRow(
                        edit41,
                        edit42,
                        edit43,
                        edit44,
                        edit45
                    )
                }
            }
        })
        edit55.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
                if (s?.length == 1) {
                    validateRow(
                        edit51,
                        edit52,
                        edit53,
                        edit54,
                        edit55
                    )
                }
            }
        })
        edit65.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
                if (s?.length == 1) {
                    validateRow(
                        edit61,
                        edit62,
                        edit63,
                        edit64,
                        edit65
                    )
                }
            }
        })
    }

    private fun makeGameInactive() {
        edit11.isEnabled = false
        edit12.isEnabled = false
        edit13.isEnabled = false
        edit14.isEnabled = false
        edit15.isEnabled = false
        edit21.isEnabled = false
        edit22.isEnabled = false
        edit23.isEnabled = false
        edit24.isEnabled = false
        edit25.isEnabled = false
        edit31.isEnabled = false
        edit32.isEnabled = false
        edit33.isEnabled = false
        edit34.isEnabled = false
        edit35.isEnabled = false
        edit41.isEnabled = false
        edit42.isEnabled = false
        edit43.isEnabled = false
        edit44.isEnabled = false
        edit45.isEnabled = false
        edit51.isEnabled = false
        edit52.isEnabled = false
        edit53.isEnabled = false
        edit54.isEnabled = false
        edit55.isEnabled = false
        edit61.isEnabled = false
        edit62.isEnabled = false
        edit63.isEnabled = false
        edit64.isEnabled = false
        edit65.isEnabled = false
    }

    private fun keepPassingFocus() {
        passFocusToNextEdt(edit11, edit12)
        passFocusToNextEdt(edit12, edit13)
        passFocusToNextEdt(edit13, edit14)
        passFocusToNextEdt(edit14, edit15)

        passFocusToNextEdt(edit21, edit22)
        passFocusToNextEdt(edit22, edit23)
        passFocusToNextEdt(edit23, edit24)
        passFocusToNextEdt(edit24, edit25)

        passFocusToNextEdt(edit31, edit32)
        passFocusToNextEdt(edit32, edit33)
        passFocusToNextEdt(edit33, edit34)
        passFocusToNextEdt(edit34, edit35)

        passFocusToNextEdt(edit41, edit42)
        passFocusToNextEdt(edit42, edit43)
        passFocusToNextEdt(edit43, edit44)
        passFocusToNextEdt(edit44, edit45)

        passFocusToNextEdt(edit51, edit52)
        passFocusToNextEdt(edit52, edit53)
        passFocusToNextEdt(edit53, edit54)
        passFocusToNextEdt(edit54, edit55)

        passFocusToNextEdt(edit61, edit62)
        passFocusToNextEdt(edit62, edit63)
        passFocusToNextEdt(edit63, edit64)
        passFocusToNextEdt(edit64, edit65)
    }
    private fun passFocusToNextEdt(edit1: EditText, edit2: EditText) {

        edit1.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
                if (s?.length == 1) {
                    edit2.requestFocus()
                }
            }

        })
    }

    private fun validateRow(edit1: EditText, edit2: EditText, edit3: EditText, edit4: EditText, edit5: EditText) {
    }
}