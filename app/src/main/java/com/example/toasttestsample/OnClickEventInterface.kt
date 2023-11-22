package com.example.toasttestsample

import android.content.Context
import androidx.fragment.app.FragmentManager

interface OnClickEventInterface {
    var  context: Context
    var supportFragmentManager: FragmentManager

    fun onClick()
}