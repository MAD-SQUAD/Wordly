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
    private lateinit var  edit11: EditText
    private lateinit var  edit12: EditText
    private lateinit var  edit13: EditText
    private lateinit var  edit14: EditText
    private lateinit var  edit15: EditText
    private lateinit var  edit21: EditText
    private lateinit var  edit22: EditText
    private lateinit var  edit23: EditText
    private lateinit var  edit24: EditText
    private lateinit var  edit25: EditText
    private lateinit var  edit31: EditText
    private lateinit var  edit32: EditText
    private lateinit var  edit33: EditText
    private lateinit var  edit34: EditText
    private lateinit var  edit35: EditText
    private lateinit var  edit41: EditText
    private lateinit var  edit42: EditText
    private lateinit var  edit43: EditText
    private lateinit var  edit44: EditText
    private lateinit var  edit45: EditText
    private lateinit var  edit51: EditText
    private lateinit var  edit52: EditText
    private lateinit var  edit53: EditText
    private lateinit var  edit54: EditText
    private lateinit var  edit55: EditText
    private lateinit var  edit61: EditText
    private lateinit var  edit62: EditText
    private lateinit var  edit63: EditText
    private lateinit var  edit64: EditText
    private lateinit var  edit65: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_game)
        edit11 = findViewById(R.id.edit_11)
        edit12 = findViewById(R.id.edit_12)
        edit13 = findViewById(R.id.edit_13)
        edit14 = findViewById(R.id.edit_14)
        edit15 = findViewById(R.id.edit_15)
        edit21 = findViewById(R.id.edit_21)
        edit22 = findViewById(R.id.edit_22)
        edit23 = findViewById(R.id.edit_23)
        edit24 = findViewById(R.id.edit_24)
        edit25 = findViewById(R.id.edit_25)
        edit31 = findViewById(R.id.edit_31)
        edit32 = findViewById(R.id.edit_32)
        edit33 = findViewById(R.id.edit_33)
        edit34 = findViewById(R.id.edit_34)
        edit35 = findViewById(R.id.edit_35)
        edit41 = findViewById(R.id.edit_41)
        edit42 = findViewById(R.id.edit_42)
        edit43 = findViewById(R.id.edit_43)
        edit44 = findViewById(R.id.edit_44)
        edit45 = findViewById(R.id.edit_45)
        edit51 = findViewById(R.id.edit_51)
        edit52 = findViewById(R.id.edit_52)
        edit53 = findViewById(R.id.edit_53)
        edit54 = findViewById(R.id.edit_54)
        edit55 = findViewById(R.id.edit_55)
        edit61 = findViewById(R.id.edit_61)
        edit62 = findViewById(R.id.edit_62)
        edit63 = findViewById(R.id.edit_63)
        edit64 = findViewById(R.id.edit_64)
        edit65 = findViewById(R.id.edit_65)
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