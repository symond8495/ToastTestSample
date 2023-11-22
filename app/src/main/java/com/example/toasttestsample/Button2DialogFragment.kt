package com.example.toasttestsample

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.DialogFragment

class Button2DialogFragment : DialogFragment(), DialogFragmentInterface{
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            // Use the Builder class for convenient dialog construction
            val builder = AlertDialog.Builder(it)
            builder.setTitle("Button2")
            builder.setMessage("Button2が押されました")
            builder.setPositiveButton("OK", OnClickDialogButtonListener())
            builder.setNegativeButton("NO", OnClickDialogButtonListener())
            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }

    private inner class OnClickDialogButtonListener : DialogInterface.OnClickListener{
        override fun onClick(dialog: DialogInterface?, which: Int) {
            var msg = ""
            when(which){
                DialogInterface.BUTTON_POSITIVE -> msg = "OK"
                DialogInterface.BUTTON_NEGATIVE -> msg = "NO"
            }
            Toast.makeText(activity, msg, Toast.LENGTH_LONG).show()
        }
    }
}