package com.example.toasttestsample

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager

public class Button1OnClickEvent(context: Context, supportFragmentManager: FragmentManager) {
    private var context: Context
    private var supportFragmentManager: FragmentManager
//    private var dialogFragment: Button1DialogFragment = Button1DialogFragment()
    init{
        this.context = context
        this.supportFragmentManager = supportFragmentManager
    }
    public fun button1OnClickButton(){
        Button1DialogFragment().show(this.supportFragmentManager, "Button1DialogFragment")
    }
}