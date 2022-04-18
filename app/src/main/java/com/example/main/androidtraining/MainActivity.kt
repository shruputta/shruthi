package com.example.androidtraining

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.Utils.Constants
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {

//    Textview textview = null;

    lateinit var textview: TextView
    lateinit var btnSubmit: Button
    lateinit var editText: EditText
    lateinit var button: Button

    val otp = 36
    val orgin = "https://facebook.com/"

    val contant = Constants()


    lateinit var mpref: SharedPreferences
    lateinit var mpref1: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textview = findViewById(R.id.textView)
        btnSubmit = findViewById(R.id.btn_submit)
        editText = findViewById(R.id.editTextTextMultiLine)
        button = findViewById(R.id.btn_get)

//        val a = 10/0


//        textview.setText("Hello All")
        textview.text = "Hello All"

        val host = contant.setUpMyHost()
        println(host)

        mpref = getSharedPreferences("user_details", MODE_PRIVATE)
        mpref1 = getSharedPreferences("order_details", MODE_PRIVATE)



        btnSubmit.setOnClickListener {

            val editor = mpref.edit()
            editor.putInt("api", 11)
            editor.commit()

            val intent = Intent(applicationContext, MainActivity2::class.java)
            intent.putExtra("info", editText.text.toString())
            intent.putExtra("id", 10)
            intent.putExtra("isLoggedIn", true)
            startActivity(intent)

//            mpref
        }


        button.setOnClickListener {
            //fetch the values from shared preference

            println(mpref.getInt("api", 50))
        }




//        textview.value = "Hello All"

//        textview = findViewById(R.id.textView)

        println("OnCreate")
    }


    override fun onStart() {
        super.onStart()
        println("onStart")
    }

    override fun onResume() {
        super.onResume()
        println("onResume")
    }

    override fun onPause() {
        super.onPause()
        println("onPause")
    }

    override fun onStop() {
        super.onStop()
    }
}