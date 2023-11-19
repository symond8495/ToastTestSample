package com.example.toasttestsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity(), View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)

        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
    }

    // レイアウトに直接メソッドを書き込れるメソッド
    fun buttonOnClick(view: View){ // ①クリック時の処理を追加
        Toast.makeText(this, "ボタンが押されました", Toast.LENGTH_LONG).show()
    }

    // アクティビティからメソッドに実装
    override fun onClick(view: View){
        when (view.id) { // when式を用いて条件分岐
            R.id.button2 -> Toast.makeText(this, "button2が押されました", Toast.LENGTH_LONG).show()
            R.id.button3 -> Toast.makeText(this, "button3が押されました", Toast.LENGTH_LONG).show()
            R.id.button4 -> Toast.makeText(this, "button4が押されました", Toast.LENGTH_LONG).show()

            R.id.button5 -> {
                // メッセージダイアログ
                AlertDialog.Builder(this)
                    .setTitle("タイトル")
                    .setMessage("メッセージ")
                    .setPositiveButton("OK") { dialog, which ->
                        // OKボタン押下時に実行したい処理を記述
                    }
                    .setNegativeButton("No") { dialog, which ->
                        // OKボタン押下時に実行したい処理を記述
                    }
                    .setCancelable(false)
                    .create()
                    .show()
            }
        }
    }
}