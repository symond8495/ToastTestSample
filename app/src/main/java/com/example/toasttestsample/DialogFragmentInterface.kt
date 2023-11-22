package com.example.toasttestsample

import android.app.Dialog
import android.os.Bundle

interface DialogFragmentInterface{
    fun onCreateDialog(savedInstanceState: Bundle?): Dialog
    interface OnClickDialogButtonListener{
        fun onClick()
    }
}