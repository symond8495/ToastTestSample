package com.example.toasttestsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity(), View.OnClickListener{
    private val onClickEvent = Button1OnClickEvent(context = this, supportFragmentManager)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
    }
    override fun onClick(view: View){
        when (view.id) { // when式を用いて条件分岐
            R.id.button -> onClickEvent.button1OnClickButton()
//            R.id.button2 -> onClickEvent.button2OnClickButton()
//            R.id.button3 -> onClickEvent.button3OnClickButton()
        }
    }
}