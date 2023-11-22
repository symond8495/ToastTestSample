package com.example.toasttestsample

import android.content.Context
import android.widget.Toast

public class OnClickEvent(context: Context) {
    private var context: Context? = null
    init{
        this.context = context
    }
    public fun button1OnClickButton(){
        Toast.makeText(context, "button1が押されました", Toast.LENGTH_LONG).show()
    }
    public fun button2OnClickButton(){
        Toast.makeText(context, "button2が押されました", Toast.LENGTH_LONG).show()
    }
    public fun button3OnClickButton(){
        Toast.makeText(context, "button3が押されました", Toast.LENGTH_LONG).show()
    }
}