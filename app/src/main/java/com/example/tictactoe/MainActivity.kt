package com.example.tictactoe

import android.location.GnssAntennaInfo.Listener
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var a = 0


    private var boardList = mutableListOf<ImageView>()

    lateinit var playerCh: TextView


    lateinit var a1: ImageView
    lateinit var a2: ImageView
    lateinit var a3: ImageView


    lateinit var b1: ImageView
    lateinit var b2: ImageView
    lateinit var b3: ImageView


    lateinit var c1: ImageView
    lateinit var c2: ImageView
    lateinit var c3: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadElements()

        a1.setOnClickListener{
            onClick(it as ImageView)
        }
        a2.setOnClickListener{
            onClick(it as ImageView)
        }
        a3.setOnClickListener{
            onClick(it as ImageView)
        }

        b1.setOnClickListener{
            onClick(it as ImageView)
        }
        b2.setOnClickListener{
            onClick(it as ImageView)
        }
        b3.setOnClickListener{
            onClick(it as ImageView)
        }

        c1.setOnClickListener{
            onClick(it as ImageView)
        }
        c2.setOnClickListener{
            onClick(it as ImageView)
        }
        c3.setOnClickListener{
            onClick(it as ImageView)
        }
    }

    private fun loadElements() {
        playerCh = findViewById(R.id.Playerchanger)

        a1 = findViewById(R.id.a1)
        a2 = findViewById(R.id.a2)
        a3 = findViewById(R.id.a3)

        b1 = findViewById(R.id.b1)
        b2 = findViewById(R.id.b2)
        b3 = findViewById(R.id.b3)

        c1 = findViewById(R.id.c1)
        c2 = findViewById(R.id.c2)
        c3 = findViewById(R.id.c3)


    }

    private fun onClick(view: ImageView) {
        if (!(view in boardList)) {
            if (a % 2 == 0 && a <= 9) {
                view.setImageResource(R.drawable.x_sign)
            } else {
                view.setImageResource(R.drawable.o_sign)
            }
            a++
            boardList.add(view)
        }
    }
}