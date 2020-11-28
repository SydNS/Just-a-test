package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val first_number = findViewById<EditText>(R.id.first_number)
        val second_number = findViewById<EditText>(R.id.second_number)
        val add = findViewById<Button>(R.id.add)
        val answer = findViewById<TextView>(R.id.answer)
        val divide = findViewById<Button>(R.id.divide)
        val multiply = findViewById<Button>(R.id.multiply)
        val subtract = findViewById<Button>(R.id.subtract)

// the methods for calculating the various mathematical operations
        add.setOnClickListener {
            answer?.text = "${first_number.text.toString().toFloat() + second_number.text.toString().toFloat()}"

        }
        subtract.setOnClickListener {
            answer?.text = "${first_number.text.toString().toFloat() - second_number.text.toString().toFloat()}"

        }
        multiply.setOnClickListener {
            answer?.text = "${first_number.text.toString().toFloat() * second_number.text.toString().toFloat()}"

        }
        divide.setOnClickListener {
            answer?.text = "${first_number.text.toString().toFloat() / second_number.text.toString().toFloat()}"

        }


    }
}