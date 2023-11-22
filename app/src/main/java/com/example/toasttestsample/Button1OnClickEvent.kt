package com.example.toasttestsample

import android.content.Context
import androidx.fragment.app.FragmentManager

public class Button1OnClickEvent(context: Context, supportFragmentManager: FragmentManager): OnClickEventInterface {
    override var context: Context
    override var supportFragmentManager: FragmentManager
//    private var dialogFragment: Button1DialogFragment = Button1DialogFragment()
    init{
        this.context = context
        this.supportFragmentManager = supportFragmentManager
    }
    override fun onClick(){
        Button1DialogFragment().show(this.supportFragmentManager, "Button1DialogFragment")
    }
}