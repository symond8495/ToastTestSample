package com.example.toasttestsample

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import com.example.toasttestsample.onClickEvent.Button1OnClickEvent
import com.example.toasttestsample.onClickEvent.Button2OnClickEvent
import com.example.toasttestsample.onClickEvent.Button3OnClickEvent
import com.example.toasttestsample.onClickEvent.OnClickEventInterface

class MainActivity : AppCompatActivity(), View.OnClickListener{
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
        var onClickEvent = Event.event(view, this, supportFragmentManager)
        onClickEvent.onClick()
    }
}

class Event() {
    companion object {
        fun event(view: View, context: Context, supportFragmentManager : FragmentManager): OnClickEventInterface {
            when(view.id){
                R.id.button -> return Button1OnClickEvent(context = context, supportFragmentManager)
                R.id.button2 -> return Button2OnClickEvent(context = context, supportFragmentManager)
                R.id.button3 -> return Button3OnClickEvent(context = context, supportFragmentManager)
            }
            return throw IllegalStateException("アクティビティがnullです")
        }
    }
}