package com.example.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice(){
        val resultText: TextView = findViewById(R.id.result_text)
        /*resultText.text ="Dice Rolled"*/
        val randomInt = (1..6).random()
        resultText.text = randomInt.toString()
        Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT).show()
    }
}