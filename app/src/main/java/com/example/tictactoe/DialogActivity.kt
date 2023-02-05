package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class DialogActivity : AppCompatActivity() {

    lateinit var winner: TextView
    lateinit var restart: AppCompatButton
    lateinit var home: AppCompatButton
    lateinit var menu: AppCompatButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog)
        loadElements()


    }

    private fun loadElements() {
        winner = findViewById(R.id.winner)
        restart = findViewById(R.id.restart)
        home = findViewById(R.id.home)
        menu = findViewById(R.id.menu)
    }
}