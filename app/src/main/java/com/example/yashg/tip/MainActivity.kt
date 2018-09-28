package com.example.yashg.tip

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView5.visibility = View.INVISIBLE

        button1.setOnClickListener {
            var bill = editText3.text.toString().toDouble()
            var tipPercentage = editText4.text.toString().toDouble() / 100
            var tip = bill * tipPercentage
            textView5.visibility = View.VISIBLE
            var High= tip + bill
            textView5.text = "Tip: ${doubletodollar(tip)} Total: ${doubletodollar(High)}"
        }
    }
    fun doubletodollar(number:Double): String{
        return "$"+ String.format("%.2f",number)
    }
}
