package com.example.toasttestsample.onClickEvent

import android.content.Context
import androidx.fragment.app.FragmentManager
import com.example.toasttestsample.dialogFragment.Button1DialogFragment

public class Button1OnClickEvent(context: Context, supportFragmentManager: FragmentManager):
    OnClickEventInterface {
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