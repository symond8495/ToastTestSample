package com.example.toasttestsample

import android.content.Context
import androidx.fragment.app.FragmentManager

public class Button3OnClickEvent(context: Context, supportFragmentManager: FragmentManager): OnClickEventInterface {
    override var context: Context
    override var supportFragmentManager: FragmentManager
    init{
        this.context = context
        this.supportFragmentManager = supportFragmentManager
    }
    override fun onClick(){
        Button3DialogFragment().show(this.supportFragmentManager, "Button3DialogFragment")
    }
}