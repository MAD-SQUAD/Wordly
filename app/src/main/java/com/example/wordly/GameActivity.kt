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
            if (edit11.text.any { it.isLetter() }) {
                if (edit12.text.any{it.isLetter()}){
                    if (edit13.text.any{it.isLetter()}){
                        if (edit14.text.any{it.isLetter()}){
                            if(edit15.text.any{it.isLetter()}){
                                if(edit21.text.any{it.isLetter()}){
                                    if(edit22.text.any{it.isLetter()}){
                                        if(edit23.text.any{it.isLetter()}){
                                            if(edit24.text.any{it.isLetter()}){
                                                if(edit25.text.any{it.isLetter()}){
                                                    if(edit31.text.any{it.isLetter()}){
                                                        if(edit32.text.any{it.isLetter()}){
                                                            if(edit33.text.any{it.isLetter()}){
                                                                if(edit34.text.any{it.isLetter()}){
                                                                    if(edit35.text.any{it.isLetter()}){
                                                                        if(edit41.text.any{it.isLetter()}){
                                                                            if(edit42.text.any{it.isLetter()}){
                                                                                if(edit43.text.any{it.isLetter()}){
                                                                                    if(edit44.text.any{it.isLetter()}){
                                                                                        if(edit45.text.any{it.isLetter()}){
                                                                                            if(edit51.text.any{it.isLetter()}){
                                                                                                if(edit52.text.any{it.isLetter()}){
                                                                                                    if(edit53.text.any{it.isLetter()}){
                                                                                                        if(edit54.text.any{it.isLetter()}){
                                                                                                            if(edit55.text.any{it.isLetter()}){
                                                                                                                if(edit61.text.any{it.isLetter()}){
                                                                                                                    if(edit62.text.any{it.isLetter()}){
                                                                                                                        if(edit63.text.any{it.isLetter()}){
                                                                                                                            if(edit64.text.any{it.isLetter()}){
                                                                                                                                if(edit65.text.any{it.isLetter()}){
                                                                                                                                }else{edit65.append(str)}
                                                                                                                            }else{edit64.append(str)}
                                                                                                                        }else{edit63.append(str)}
                                                                                                                    }else{edit62.append(str)}
                                                                                                                }else{edit61.append(str)}
                                                                                                            }else{edit55.append(str)}
                                                                                                        }else{edit54.append(str)}
                                                                                                    }else{edit53.append(str)}
                                                                                                }else{edit52.append(str)}
                                                                                            }else{edit51.append(str)}
                                                                                        }else{edit45.append(str)}
                                                                                    }else{edit44.append(str)}
                                                                                }else{edit43.append(str)}
                                                                            }else{edit42.append(str)}
                                                                        }else{edit41.append(str)}
                                                                    }else{edit35.append(str)}
                                                                }else{edit34.append(str)}
                                                            }else{edit33.append(str)}
                                                        }else{edit32.append(str)}
                                                    }else{edit31.append(str)}
                                                }else{edit25.append(str)}
                                            }else{edit24.append(str)}
                                        }else{edit23.append(str)}
                                    }else{edit22.append(str)}
                                }else{edit21.append(str)}
                            }else{edit15.append(str)}
                        }else{edit14.append(str)}
                    }else{edit13.append(str)}
                }else{edit12.append(str)}
            }else{edit11.append(str)}
        }
        fun delTextFields(){
            if(edit64.text.any { it.isLetter() }){
                edit64.text = ""
            }else{
                if (edit63.text.any { it.isLetter() }){
                    edit63.text = ""
                }else{
                    if(edit62.text.any { it.isLetter() }){
                        edit62.text = ""
                    }else{
                        if(edit61.text.any { it.isLetter() }){
                            edit61.text = ""
                            return
                        }
                    }
                }
            }
            if (edit55.text == ""){
                if(edit54.text.any { it.isLetter() }){
                    edit54.text = ""
                }else{
                    if (edit53.text.any { it.isLetter() }){
                        edit53.text = ""
                    }else{
                        if(edit52.text.any { it.isLetter() }){
                            edit52.text = ""
                        }else{
                            if(edit51.text.any { it.isLetter() }){
                                edit51.text = ""
                                return
                            }
                        }
                    }
                }
            }
            if (edit45.text == ""){
                if(edit44.text.any { it.isLetter() }){
                    edit44.text = ""
                }else{
                    if (edit43.text.any { it.isLetter() }){
                        edit43.text = ""
                    }else{
                        if(edit42.text.any { it.isLetter() }){
                            edit42.text = ""
                        }else{
                            if(edit41.text.any { it.isLetter() }){
                                edit41.text = ""
                                return
                            }
                        }
                    }
                }
            }
            if (edit35.text == ""){
                if(edit34.text.any { it.isLetter() }){
                    edit34.text = ""
                }else{
                    if (edit33.text.any { it.isLetter() }){
                        edit33.text = ""
                    }else{
                        if(edit32.text.any { it.isLetter() }){
                            edit32.text = ""
                        }else{
                            if(edit31.text.any { it.isLetter() }){
                                edit31.text = ""
                                return
                            }
                        }
                    }
                }
            }
            if (edit25.text == ""){
                if(edit24.text.any { it.isLetter() }){
                    edit24.text = ""
                }else{
                    if (edit23.text.any { it.isLetter() }){
                        edit23.text = ""
                    }else{
                        if(edit22.text.any { it.isLetter() }){
                            edit22.text = ""
                        }else{
                            if(edit21.text.any { it.isLetter() }){
                                edit21.text = ""
                                return
                            }
                        }
                    }
                }
            }
            if (edit15.text == ""){
                if(edit14.text.any { it.isLetter() }){
                    edit14.text = ""
                }else{
                    if (edit13.text.any { it.isLetter() }){
                        edit13.text = ""
                    }else{
                        if(edit12.text.any { it.isLetter() }){
                            edit12.text = ""
                        }else{
                            if(edit11.text.any { it.isLetter() }){
                                edit11.text = ""
                                return
                            }
                        }
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
        edit1: TextView,
        edit2: TextView,
        edit3: TextView,
        edit4: TextView,
        edit5: TextView
    ) {

        val edit1Txt = edit1.text.toString()
        val edit2Txt = edit2.text.toString()
        val edit3Txt = edit3.text.toString()
        val edit4Txt = edit4.text.toString()
        val edit5Txt = edit5.text.toString()


        val w1 = word[0].toString()
        val w2 = word[1].toString()
        val w3 = word[2].toString()
        val w4 = word[3].toString()
        val w5 = word[4].toString()

        if (edit1Txt == w2 || edit1Txt == w3 || edit1Txt == w4 || edit1Txt == w5) {
            edit1.setBackgroundColor(Color.parseColor("#FF9800"))
        }
        if (edit2Txt == w1 || edit2Txt == w3 || edit2Txt == w4 || edit2Txt == w5) {
            edit2.setBackgroundColor(Color.parseColor("#FF9800"))
        }
        if (edit3Txt == w1 || edit3Txt == w2 || edit3Txt == w4 || edit3Txt == w5) {
            edit3.setBackgroundColor(Color.parseColor("#FF9800"))
        }
        if (edit4Txt == w1 || edit4Txt == w2 || edit4Txt == w3 || edit4Txt == w5) {
            edit4.setBackgroundColor(Color.parseColor("#FF9800"))
        }
        if (edit5Txt == w1 || edit5Txt == w2 || edit5Txt == w3 || edit5Txt == w4) {
            edit5.setBackgroundColor(Color.parseColor("#FF9800"))
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
            edit1.setBackgroundColor(Color.parseColor("#5C5F61"))
        }

        if (edit2Txt != w1 && edit2Txt != w2 && edit2Txt != w3 && edit2Txt != w4 && edit2Txt != w5) {
            edit2.setBackgroundColor(Color.parseColor("#5C5F61"))
        }

        if (edit3Txt != w1 && edit3Txt != w2 && edit3Txt != w3 && edit3Txt != w4 && edit3Txt != w5) {
            edit3.setBackgroundColor(Color.parseColor("#5C5F61"))
        }

        if (edit4Txt != w1 && edit4Txt != w2 && edit4Txt != w3 && edit4Txt != w4 && edit4Txt != w5) {
            edit4.setBackgroundColor(Color.parseColor("#5C5F61"))
        }

        if (edit5Txt != w1 && edit5Txt != w2 && edit5Txt != w3 && edit5Txt != w4 && edit5Txt != w5) {
            edit5.setBackgroundColor(Color.parseColor("#5C5F61"))
        }

        if (edit1Txt == w1 && edit2Txt == w2 && edit3Txt == w3 && edit4Txt == w4 && edit5Txt == w5) {
            makeGameInactive()
            val intent = Intent(this, WinActivity::class.java)
            intent.putExtra("win", word)
            startActivity(intent)
            return
        }

        if (edit5.id == R.id.edit_65) {
            makeGameInactive()
            val intent = Intent(this, LoseActivity::class.java)
            intent.putExtra("lose", word)
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