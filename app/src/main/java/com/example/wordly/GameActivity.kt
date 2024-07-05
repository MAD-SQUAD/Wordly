package com.example.wordly

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.graphics.Color
import android.text.TextWatcher
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.io.BufferedReader
import java.io.InputStreamReader

class GameActivity : AppCompatActivity() {

    private lateinit var wordList : List<String>
    lateinit var word : String

    private lateinit var edit11: EditText
    private lateinit var edit12: EditText
    private lateinit var edit13: EditText
    private lateinit var edit14: EditText
    private lateinit var edit15: EditText
    private lateinit var edit21: EditText
    private lateinit var edit22: EditText
    private lateinit var edit23: EditText
    private lateinit var edit24: EditText
    private lateinit var edit25: EditText
    private lateinit var edit31: EditText
    private lateinit var edit32: EditText
    private lateinit var edit33: EditText
    private lateinit var edit34: EditText
    private lateinit var edit35: EditText
    private lateinit var edit41: EditText
    private lateinit var edit42: EditText
    private lateinit var edit43: EditText
    private lateinit var edit44: EditText
    private lateinit var edit45: EditText
    private lateinit var edit51: EditText
    private lateinit var edit52: EditText
    private lateinit var edit53: EditText
    private lateinit var edit54: EditText
    private lateinit var edit55: EditText
    private lateinit var edit61: EditText
    private lateinit var edit62: EditText
    private lateinit var edit63: EditText
    private lateinit var edit64: EditText
    private lateinit var edit65: EditText

    private lateinit var a1_bt: TextView
    private lateinit var a2_bt: TextView
    private lateinit var a3_bt: TextView
    private lateinit var a4_bt: TextView
    private lateinit var a5_bt: TextView
    private lateinit var a6_bt: TextView
    private lateinit var a7_bt: TextView
    private lateinit var a8_bt: TextView
    private lateinit var a9_bt: TextView
    private lateinit var a10_bt: TextView
    private lateinit var a11_bt: TextView
    private lateinit var a12_bt: TextView

    private lateinit var b1_bt: TextView
    private lateinit var b2_bt: TextView
    private lateinit var b3_bt: TextView
    private lateinit var b4_bt: TextView
    private lateinit var b5_bt: TextView
    private lateinit var b6_bt: TextView
    private lateinit var b7_bt: TextView
    private lateinit var b8_bt: TextView
    private lateinit var b9_bt: TextView
    private lateinit var b10_bt: TextView
    private lateinit var b11_bt: TextView

    private lateinit var d1_bt: TextView
    private lateinit var d2_bt: TextView
    private lateinit var d3_bt: TextView
    private lateinit var d4_bt: TextView
    private lateinit var d5_bt: TextView
    private lateinit var d6_bt: TextView
    private lateinit var d7_bt: TextView
    private lateinit var d8_bt: TextView
    private lateinit var d9_bt: TextView

    private lateinit var back_bt: TextView
    private lateinit var check_bt: TextView
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
        keepPassingFocus()

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
        passFocusToNextEdt(edit15, edit21)

        passFocusToNextEdt(edit21, edit22)
        passFocusToNextEdt(edit22, edit23)
        passFocusToNextEdt(edit23, edit24)
        passFocusToNextEdt(edit24, edit25)
        passFocusToNextEdt(edit25, edit31)

        passFocusToNextEdt(edit31, edit32)
        passFocusToNextEdt(edit32, edit33)
        passFocusToNextEdt(edit33, edit34)
        passFocusToNextEdt(edit34, edit35)
        passFocusToNextEdt(edit35, edit41)

        passFocusToNextEdt(edit41, edit42)
        passFocusToNextEdt(edit42, edit43)
        passFocusToNextEdt(edit43, edit44)
        passFocusToNextEdt(edit44, edit45)
        passFocusToNextEdt(edit45, edit51)

        passFocusToNextEdt(edit51, edit52)
        passFocusToNextEdt(edit52, edit53)
        passFocusToNextEdt(edit53, edit54)
        passFocusToNextEdt(edit54, edit55)
        passFocusToNextEdt(edit55, edit61)

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

    @SuppressLint("DiscouragedApi")
    private fun validateRow(
        edit1: EditText,
        edit2: EditText,
        edit3: EditText,
        edit4: EditText,
        edit5: EditText
    ) {

        val edit1Txt = edit1.text.toString()
        val edit2Txt = edit2.text.toString()
        val edit3Txt = edit3.text.toString()
        val edit4Txt = edit4.text.toString()
        val edit5Txt = edit5.text.toString()

        wordList = BufferedReader(InputStreamReader(resources.openRawResource(resources.getIdentifier("words", "raw", packageName)))).readLines()
        word = wordList.random()

        val w1 = word[0].toString()
        val w2 = word[1].toString()
        val w3 = word[2].toString()
        val w4 = word[3].toString()
        val w5 = word[4].toString()

        if (edit1Txt == w2 || edit1Txt == w3 || edit1Txt == w4 || edit1Txt == w5) {
            edit1.setBackgroundColor(Color.parseColor("#ffff00"))
        }
        if (edit2Txt == w1 || edit2Txt == w3 || edit2Txt == w4 || edit2Txt == w5) {
            edit2.setBackgroundColor(Color.parseColor("#ffff00"))
        }
        if (edit3Txt == w1 || edit3Txt == w2 || edit3Txt == w4 || edit3Txt == w5) {
            edit3.setBackgroundColor(Color.parseColor("#ffff00"))
        }
        if (edit4Txt == w1 || edit4Txt == w2 || edit4Txt == w3 || edit4Txt == w5) {
            edit4.setBackgroundColor(Color.parseColor("#ffff00"))
        }
        if (edit5Txt == w1 || edit5Txt == w2 || edit5Txt == w3 || edit5Txt == w4) {
            edit5.setBackgroundColor(Color.parseColor("#ffff00"))
        }

        if (edit1Txt == w1) {
            edit1.setBackgroundColor(Color.parseColor("#33cc33"))
        }
        if (edit2Txt == w2) {
            edit2.setBackgroundColor(Color.parseColor("#33cc33"))
        }
        if (edit3Txt == w3) {
            edit3.setBackgroundColor(Color.parseColor("#33cc33"))
        }
        if (edit4Txt == w4) {
            edit4.setBackgroundColor(Color.parseColor("#33cc33"))
        }
        if (edit5Txt == w5) {
            edit5.setBackgroundColor(Color.parseColor("#33cc33"))
        }

        if (edit1Txt != w1 && edit1Txt != w2 && edit1Txt != w3 && edit1Txt != w4 && edit1Txt != w5) {
            edit1.setBackgroundColor(Color.parseColor("#ff3333"))
        }

        if (edit2Txt != w1 && edit2Txt != w2 && edit2Txt != w3 && edit2Txt != w4 && edit2Txt != w5) {
            edit2.setBackgroundColor(Color.parseColor("#ff3333"))
        }

        if (edit3Txt != w1 && edit3Txt != w2 && edit3Txt != w3 && edit3Txt != w4 && edit3Txt != w5) {
            edit3.setBackgroundColor(Color.parseColor("#ff3333"))
        }

        if (edit4Txt != w1 && edit4Txt != w2 && edit4Txt != w3 && edit4Txt != w4 && edit4Txt != w5) {
            edit4.setBackgroundColor(Color.parseColor("#ff3333"))
        }

        if (edit5Txt != w1 && edit5Txt != w2 && edit5Txt != w3 && edit5Txt != w4 && edit5Txt != w5) {
            edit5.setBackgroundColor(Color.parseColor("#ff3333"))
        }

        if (edit1Txt == w1 && edit2Txt == w2 && edit3Txt == w3 && edit4Txt == w4 && edit5Txt == w5) {
            makeGameInactive()
            Toast.makeText(
                applicationContext,
                "Congratulations, you have guessed the right word.",
                Toast.LENGTH_SHORT
            ).show()
            return
        }

        if (edit5.id == R.id.edit_65) {
            makeGameInactive()
            Toast.makeText(
                applicationContext,
                "Sorry you couldn't guess the word.",
                Toast.LENGTH_SHORT
            ).show()

        }
    }
}