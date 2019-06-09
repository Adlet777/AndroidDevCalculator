package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var a: String = ""
        var b: String = ""
        var c: String = ""

        one.setOnClickListener {
            if(c!="on" ){
                if(a=="0"){
                    a = a.removeSuffix(a.last().toString())
                    a = a + "1"
                    textView.text = a
                }
                else{
                    a = a + "1"
                    textView.text = a
                }

            }
            if(c=="on"){
                if(b=="0"){
                    b=b.removeSuffix(b.last().toString())
                    b = b+"1"
                    textView.text = a + b
                }
                else{
                b = b + "1"
                textView.text = a + b
                }
            }
        }
        two.setOnClickListener {
            if(c!="on" ){
                if(a=="0"){
                    a = a.removeSuffix(a.last().toString())
                    a = a + "2"
                    textView.text = a
                }
                else{
                    a = a + "2"
                    textView.text = a
                }

            }
            if(c=="on"){
                if(b=="0"){
                    b=b.removeSuffix(b.last().toString())
                    b = b+"2"
                    textView.text = a + b
                }
                else{
                    b = b + "2"
                    textView.text = a + b
                }
            }
        }
        three.setOnClickListener {
            if(c!="on" ){
                if(a=="0"){
                    a = a.removeSuffix(a.last().toString())
                    a = a + "3"
                    textView.text = a
                }
                else{
                    a = a + "3"
                    textView.text = a
                }

            }
            if(c=="on"){
                if(b=="0"){
                    b=b.removeSuffix(b.last().toString())
                    b = b+"3"
                    textView.text = a + b
                }
                else{
                    b = b + "3"
                    textView.text = a + b
                }
            }
        }
        four.setOnClickListener {
            if(c!="on" ){
                if(a=="0"){
                    a = a.removeSuffix(a.last().toString())
                    a = a + "4"
                    textView.text = a
                }
                else{
                    a = a + "4"
                    textView.text = a
                }

            }
            if(c=="on"){
                if(b=="0"){
                    b=b.removeSuffix(b.last().toString())
                    b = b+"4"
                    textView.text = a + b
                }
                else{
                    b = b + "4"
                    textView.text = a + b
                }
            }
        }
        five.setOnClickListener {
            if(c!="on" ){
                if(a=="0"){
                    a = a.removeSuffix(a.last().toString())
                    a = a + "5"
                    textView.text = a
                }
                else{
                    a = a + "5"
                    textView.text = a
                }

            }
            if(c=="on"){
                if(b=="0"){
                    b=b.removeSuffix(b.last().toString())
                    b = b+"5"
                    textView.text = a + b
                }
                else{
                    b = b + "5"
                    textView.text = a + b
                }
            }
        }
        six.setOnClickListener {
            if(c!="on" ){
                if(a=="0"){
                    a = a.removeSuffix(a.last().toString())
                    a = a + "6"
                    textView.text = a
                }
                else{
                    a = a + "6"
                    textView.text = a
                }

            }
            if(c=="on"){
                if(b=="0"){
                    b=b.removeSuffix(b.last().toString())
                    b = b+"6"
                    textView.text = a + b
                }
                else{
                    b = b + "6"
                    textView.text = a + b
                }
            }
        }
        seven.setOnClickListener {
            if(c!="on" ){
                if(a=="0"){
                    a = a.removeSuffix(a.last().toString())
                    a = a + "7"
                    textView.text = a
                }
                else{
                    a = a + "7"
                    textView.text = a
                }

            }
            if(c=="on"){
                if(b=="0"){
                    b=b.removeSuffix(b.last().toString())
                    b = b+"7"
                    textView.text = a + b
                }
                else{
                    b = b + "7"
                    textView.text = a + b
                }
            }
        }
        eight.setOnClickListener {
            if(c!="on" ){
                if(a=="0"){
                    a = a.removeSuffix(a.last().toString())
                    a = a + "8"
                    textView.text = a
                }
                else{
                    a = a + "8"
                    textView.text = a
                }

            }
            if(c=="on"){
                if(b=="0"){
                    b=b.removeSuffix(b.last().toString())
                    b = b+"8"
                    textView.text = a + b
                }
                else{
                    b = b + "8"
                    textView.text = a + b
                }
            }
        }
        nine.setOnClickListener {
            if(c!="on" ){
                if(a=="0"){
                    a = a.removeSuffix(a.last().toString())
                    a = a + "9"
                    textView.text = a
                }
                else{
                    a = a + "9"
                    textView.text = a
                }

            }
            if(c=="on"){
                if(b=="0"){
                    b=b.removeSuffix(b.last().toString())
                    b = b+"9"
                    textView.text = a + b
                }
                else{
                    b = b + "9"
                    textView.text = a + b
                }
            }
        }
        zero.setOnClickListener {
            if(c!="on" ){
                a = a + "0"
                textView.text = a
            }
            if(c=="on" ){
                b = b + "0"
                textView.text = a + b
            }
        }





        product.setOnClickListener {
            if (c != "on") {
                a = a + "*"
                textView.text = a
                c = "on"

            }
            if (c == "on") {
                a = a.removeSuffix(a.last().toString()) + "*"
                textView.text = a
                c = "on"
            }

        }
        minus.setOnClickListener {

            if (c != "on") {
                a = a + "-"
                textView.text = a
                c = "on"

            }
            if (c == "on") {
                a = a.removeSuffix(a.last().toString()) + "-"
                textView.text = a
                c = "on"
            }
        }
        sum.setOnClickListener {
            if(c!="on") {
                a = a + "+"
                textView.text = a
                c = "on"

            }
            if(c=="on"){
                a = a.removeSuffix(a.last().toString()) + "+"
                textView.text = a
                c = "on"
            }
        }
        division.setOnClickListener {
            if (c != "on") {
                a = a + "/"
                textView.text = a
                c = "on"

            }
            if (c == "on") {
                a = a.removeSuffix(a.last().toString()) + "/"
                textView.text = a
                c = "on"
            }
        }

        clear.setOnClickListener {
            if(c!= "on"){
                a = a.removeSuffix(a.last().toString())
                textView.text = a
            }
            if(c=="on"){
                if(b==""){
                    a = a.removeSuffix(a.last().toString())
                    c = ""
                    textView.text = a
                }
                if(b!=""){
                    b = b.removeSuffix(b.last().toString())
                    textView.text = a + b
                }

            }
        }

        equal.setOnClickListener {

            if(c=="on" && b!=""){
            var intent = Intent(this,SecondActivity::class.java).putExtra("firstVar",a).putExtra("secondVar",b)
            startActivity(intent)
            }

        }



    }
}
