package com.example.diceroller_kt

import android.graphics.Color
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var diceNumber: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val roll: Button = findViewById(R.id.roll)
        roll.setTextColor(Color.RED)  // program
        roll.setBackgroundColor(Color.WHITE)
        roll.setOnClickListener {
            Log.d("MainActivity", "OnclickListener Called: ")
            rollDice()
        }
        diceNumber = findViewById(R.id.dice_image)

    }

    private fun rollDice() {
        val randomNumber: Int = Random.nextInt(6) + 1
        var drawableResource = when (randomNumber) {

            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }
        diceNumber.setImageResource(drawableResource)


    }


}