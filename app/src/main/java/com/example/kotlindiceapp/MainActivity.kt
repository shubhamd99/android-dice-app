package com.example.kotlindiceapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    // For faster performance
    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollBtn: Button = findViewById(R.id.roll_button)
        rollBtn.setOnClickListener {
           // Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT)
            rollDice()
        }
          diceImage = findViewById(R.id.dice_image)
    }

    private fun rollDice() {

        val randomInt = Random().nextInt(6) + 1 // Random values from 1 to 6
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)

    }
}
