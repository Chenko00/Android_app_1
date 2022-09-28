package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    var i = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.textView)
        val buttonPlus = findViewById<Button>(R.id.button)
        val buttonMinus = findViewById<Button>(R.id.button2)
        val textNum = findViewById<TextInputEditText>(R.id.textnumb)
        val text = "Toast!"
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(applicationContext, text, duration)
        buttonPlus.setOnClickListener {
            var num = textNum.text.toString().toInt()
            textView.text = i.toString()
            i += num
        }
        buttonMinus.setOnClickListener {
            var num = textNum.text.toString().toInt()
            if(i-num < 0)
                toast.show()
            else
            {
                i -= num
                textView.text = i.toString()
            }
        }
    }
}