package com.rakamin.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnRoll = findViewById<Button>(R.id.button)
        var numberRoll = findViewById<TextView>(R.id.number)

        btnRoll.setOnClickListener {
            val num = rollNumber()
            numberRoll.text = num.toString()
        }
    }

    fun rollNumber() : Int{
        val ranNum = (1..6).random()
        return ranNum
    }
}