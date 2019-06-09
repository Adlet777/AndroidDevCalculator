package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_second.*


class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var firstVar = intent.getStringExtra("firstVar") as String
        Log.d("First_Variable", firstVar)

        var secondVar = intent.getStringExtra("secondVar") as String
        Log.d("Second_Variable", secondVar)

        if(firstVar.last().toString() == "+"){
            firstVar = firstVar.removeSuffix(firstVar.last().toString())
            res.text = (firstVar.toInt() + secondVar.toInt()).toString()
        }
        if(firstVar.last().toString() == "*"){
            firstVar = firstVar.removeSuffix(firstVar.last().toString())
            res.text = (firstVar.toInt() * secondVar.toInt()).toString()
        }
        if(firstVar.last().toString() == "-"){
            firstVar = firstVar.removeSuffix(firstVar.last().toString())
            res.text = (firstVar.toInt() - secondVar.toInt()).toString()
        }
        if(firstVar.last().toString() == "/"){
            if(secondVar!="0"){
            firstVar = firstVar.removeSuffix(firstVar.last().toString())
            res.text = (firstVar.toInt() / secondVar.toInt()).toString()
            }
            if(secondVar=="0"){
                res.text = "infinity"
            }

        }

        goBack.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
