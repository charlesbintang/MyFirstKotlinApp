package com.charles.myfirstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var btnAdd: Button
    lateinit var btnSub: Button
    lateinit var btnMultiply: Button
    lateinit var btnDivision: Button
    lateinit var etA: EditText
    lateinit var etB: EditText
    lateinit var resultTv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAdd = findViewById(R.id.btn_add)
        btnSub = findViewById(R.id.btn_subtraction)
        btnMultiply = findViewById(R.id.btn_multiplication)
        btnDivision = findViewById(R.id.btn_division)
        etA = findViewById(R.id.et_a)
        etB = findViewById(R.id.et_b)
        resultTv = findViewById(R.id.result_tv)

        btnAdd.setOnClickListener(this)
        btnSub.setOnClickListener(this)
        btnDivision.setOnClickListener(this)
        btnMultiply.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var numberA = etA.text.toString().toDouble()
        var numberB = etB.text.toString().toDouble()
        var result = 0.0

        when (v?.id) {
            R.id.btn_add -> {
                result = numberA + numberB
            }

            R.id.btn_subtraction -> {
                result = numberA - numberB
            }

            R.id.btn_multiplication -> {
                result = numberA * numberB
            }

            R.id.btn_division -> {
                result = numberA / numberB
            }
        }
        resultTv.text = "Result is $result"
    }
}