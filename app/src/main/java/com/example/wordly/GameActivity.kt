package com.example.wordly

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.graphics.Color
import android.text.TextWatcher
import android.widget.ImageView
import android.content.Context
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.File
import kotlin.properties.Delegates

class GameActivity : AppCompatActivity() {

    private lateinit var wordList: List<String>
    lateinit var word: String

    private lateinit var edit11: TextView
    private lateinit var edit12: TextView
    private lateinit var edit13: TextView
    private lateinit var edit14: TextView
    private lateinit var edit15: TextView
    private lateinit var edit21: TextView
    private lateinit var edit22: TextView
    private lateinit var edit23: TextView
    private lateinit var edit24: TextView
    private lateinit var edit25: TextView
    private lateinit var edit31: TextView
    private lateinit var edit32: TextView
    private lateinit var edit33: TextView
    private lateinit var edit34: TextView
    private lateinit var edit35: TextView
    private lateinit var edit41: TextView
    private lateinit var edit42: TextView
    private lateinit var edit43: TextView
    private lateinit var edit44: TextView
    private lateinit var edit45: TextView
    private lateinit var edit51: TextView
    private lateinit var edit52: TextView
    private lateinit var edit53: TextView
    private lateinit var edit54: TextView
    private lateinit var edit55: TextView
    private lateinit var edit61: TextView
    private lateinit var edit62: TextView
    private lateinit var edit63: TextView
    private lateinit var edit64: TextView
    private lateinit var edit65: TextView

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

    private lateinit var back_bt: ImageView
    private lateinit var check_bt: TextView
    private var x: Int = 1
    override fun onCreate(savedInstanceState: Bundle?) {

        wordList = BufferedReader(
            InputStreamReader(
                resources.openRawResource(
                    resources.getIdentifier(
                        "words",
                        "raw",
                        packageName
                    )
                )
            )
        ).readLines()
        word = wordList.random().uppercase()

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val sharedPreferences = getSharedPreferences("AppSettings", Context.MODE_PRIVATE)
        val isDarkTheme = sharedPreferences.getBoolean("isDarkTheme", true)
        setAppTheme(isDarkTheme)

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
        val helpButton: ImageView = findViewById(R.id.help_view_game)

        helpButton.setOnClickListener {
            val intent = Intent(this, HelpActivity::class.java)
            startActivity(intent)
        }

        keepPassingFocus()

        fun setTextFields(str: String) {
            val editTexts = listOf(
                edit11, edit12, edit13, edit14, edit15,
                edit21, edit22, edit23, edit24, edit25,
                edit31, edit32, edit33, edit34, edit35,
                edit41, edit42, edit43, edit44, edit45,
                edit51, edit52, edit53, edit54, edit55,
                edit61, edit62, edit63, edit64, edit65
            )

            for (editText in editTexts) {
                if (!editText.text.any { it.isLetter() }) {
                    editText.append(str)
                    return
                }
            }
        }

        fun delTextFields() {
            val editGroups = listOf(
                listOf(edit64, edit63, edit62, edit61),
                listOf(edit54, edit53, edit52, edit51),
                listOf(edit44, edit43, edit42, edit41),
                listOf(edit34, edit33, edit32, edit31),
                listOf(edit24, edit23, edit22, edit21),
                listOf(edit14, edit13, edit12, edit11)
            )

            for (group in editGroups) {
                for (editText in group) {
                    if (editText.text.any { it.isLetter() }) {
                        editText.text = ""
                        return
                    }
                }
            }
        }

        a1_bt = findViewById(R.id.a1_bt)
        a1_bt.setOnClickListener {
            setTextFields("Й")
        }
        a2_bt = findViewById(R.id.a2_bt)
        a2_bt.setOnClickListener {
            setTextFields("Ц")
        }
        a3_bt = findViewById(R.id.a3_bt)
        a3_bt.setOnClickListener {
            setTextFields("У")
        }
        a4_bt = findViewById(R.id.a4_bt)
        a4_bt.setOnClickListener {
            setTextFields("К")
        }
        a5_bt = findViewById(R.id.a5_bt)
        a5_bt.setOnClickListener {
            setTextFields("Е")
        }
        a6_bt = findViewById(R.id.a6_bt)
        a6_bt.setOnClickListener {
            setTextFields("Н")
        }
        a7_bt = findViewById(R.id.a7_bt)
        a7_bt.setOnClickListener {
            setTextFields("Г")
        }
        a8_bt = findViewById(R.id.a8_bt)
        a8_bt.setOnClickListener {
            setTextFields("Ш")
        }
        a9_bt = findViewById(R.id.a9_bt)
        a9_bt.setOnClickListener {
            setTextFields("Щ")
        }
        a10_bt = findViewById(R.id.a10_bt)
        a10_bt.setOnClickListener {
            setTextFields("З")
        }
        a11_bt = findViewById(R.id.a11_bt)
        a11_bt.setOnClickListener {
            setTextFields("Х")
        }
        a12_bt = findViewById(R.id.a12_bt)
        a12_bt.setOnClickListener {
            setTextFields("Ъ")
        }
        b1_bt = findViewById(R.id.b1_bt)
        b1_bt.setOnClickListener {
            setTextFields("Ф")
        }
        b2_bt = findViewById(R.id.b2_bt)
        b2_bt.setOnClickListener {
            setTextFields("Ы")
        }
        b3_bt = findViewById(R.id.b3_bt)
        b3_bt.setOnClickListener {
            setTextFields("В")
        }
        b4_bt = findViewById(R.id.b4_bt)
        b4_bt.setOnClickListener {
            setTextFields("А")
        }
        b5_bt = findViewById(R.id.b5_bt)
        b5_bt.setOnClickListener {
            setTextFields("П")
        }
        b6_bt = findViewById(R.id.b6_bt)
        b6_bt.setOnClickListener {
            setTextFields("Р")
        }
        b7_bt = findViewById(R.id.b7_bt)
        b7_bt.setOnClickListener {
            setTextFields("О")
        }
        b8_bt = findViewById(R.id.b8_bt)
        b8_bt.setOnClickListener {
            setTextFields("Л")
        }
        b9_bt = findViewById(R.id.b9_bt)
        b9_bt.setOnClickListener {
            setTextFields("Д")
        }
        b10_bt = findViewById(R.id.b10_bt)
        b10_bt.setOnClickListener {
            setTextFields("Ж")
        }
        b11_bt = findViewById(R.id.b11_bt)
        b11_bt.setOnClickListener {
            setTextFields("Э")
        }
        d1_bt = findViewById(R.id.d1_bt)
        d1_bt.setOnClickListener {
            setTextFields("Я")
        }
        d2_bt = findViewById(R.id.d2_bt)
        d2_bt.setOnClickListener {
            setTextFields("Ч")
        }
        d3_bt = findViewById(R.id.d3_bt)
        d3_bt.setOnClickListener {
            setTextFields("С")
        }
        d4_bt = findViewById(R.id.d4_bt)
        d4_bt.setOnClickListener {
            setTextFields("М")
        }
        d5_bt = findViewById(R.id.d5_bt)
        d5_bt.setOnClickListener {
            setTextFields("И")
        }
        d6_bt = findViewById(R.id.d6_bt)
        d6_bt.setOnClickListener {
            setTextFields("Т")
        }
        d7_bt = findViewById(R.id.d7_bt)
        d7_bt.setOnClickListener {
            setTextFields("Ь")
        }
        d8_bt = findViewById(R.id.d8_bt)
        d8_bt.setOnClickListener {
            setTextFields("Б")
        }
        d9_bt = findViewById(R.id.d9_bt)
        d9_bt.setOnClickListener {
            setTextFields("Ю")
        }
        back_bt = findViewById(R.id.back_bt)
        back_bt.setOnClickListener {
            delTextFields()
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
        val editTexts = listOf(
            edit11, edit12, edit13, edit14, edit15,
            edit21, edit22, edit23, edit24, edit25,
            edit31, edit32, edit33, edit34, edit35,
            edit41, edit42, edit43, edit44, edit45,
            edit51, edit52, edit53, edit54, edit55,
            edit61, edit62, edit63, edit64, edit65
        )

        editTexts.forEach { it.isEnabled = false }
    }


    private fun keepPassingFocus() {
        val editTexts = listOf(
            edit11, edit12, edit13, edit14, edit15,
            edit21, edit22, edit23, edit24, edit25,
            edit31, edit32, edit33, edit34, edit35,
            edit41, edit42, edit43, edit44, edit45,
            edit51, edit52, edit53, edit54, edit55,
            edit61, edit62, edit63, edit64, edit65
        )

        for (i in 0 until editTexts.size - 1) {
            passFocusToNextEdt(editTexts[i], editTexts[i + 1])
        }
    }

    private fun passFocusToNextEdt(edit1: TextView, edit2: TextView) {

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
        vararg edits: TextView
    ) {
        val editTexts = edits.map { it.text.toString() }
        val wordLetters = word.map { it.toString() }

        for (i in editTexts.indices) {
            when {
                editTexts[i] == wordLetters[i] -> edits[i].setBackgroundColor(Color.parseColor("#33cc33"))
                editTexts[i] in wordLetters -> edits[i].setBackgroundColor(Color.parseColor("#FF9800"))
                else -> edits[i].setBackgroundColor(Color.parseColor("#5C5F61"))
            }
        }

        if (editTexts.zip(wordLetters).all { it.first == it.second }) {
            makeGameInactive()
            val intent = Intent(this, WinActivity::class.java).apply {
                putExtra("win", word)
            }
            startActivity(intent)
            return
        }

        if (edits.last().id == R.id.edit_65) {
            makeGameInactive()
            val intent = Intent(this, LoseActivity::class.java).apply {
                putExtra("lose", word)
            }
            startActivity(intent)
            return
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