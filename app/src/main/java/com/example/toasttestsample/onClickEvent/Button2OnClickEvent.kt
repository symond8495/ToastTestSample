package com.example.toasttestsample.onClickEvent

import android.content.Context
import androidx.fragment.app.FragmentManager
import com.example.toasttestsample.dialogFragment.Button2DialogFragment

public class Button2OnClickEvent(context: Context, supportFragmentManager: FragmentManager):
    OnClickEventInterface {
    override var context: Context
    override var supportFragmentManager: FragmentManager
    init{
        this.context = context
        this.supportFragmentManager = supportFragmentManager
    }
    override fun onClick(){
        Button2DialogFragment().show(this.supportFragmentManager, "Button2DialogFragment")
    }
}