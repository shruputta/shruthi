package com.example.androidtraining

import android.content.SharedPreferences
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.KotlinBasic.Android
import com.example.KotlinBasic.KotlinBasic
import com.example.KotlinBasic.MethodCalling
import com.example.Utils.Constants
import com.example.myapplication.R

class MainActivity2 : AppCompatActivity() {

//    val basic = KotlinBasic()

    lateinit var textTitle: TextView

    lateinit var mpref: SharedPreferences

    lateinit var name: String
    var api: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actiivty_main_2)

        textTitle = findViewById(R.id.title)
//        val methodCalling = MethodCalling()
//        methodCalling.method2()
//        methodCalling.main()

        mpref = getSharedPreferences("user_details", MODE_PRIVATE)

        mpref?.let {
            //statement

            name = mpref.getString("name", "No name found")!!
            api = mpref.getInt("api", 32)

            textTitle.text = name

        }



        val bundle = intent.extras


        bundle?.let {
            val title = bundle.getString("info")
            val id = bundle.getInt("id")
            val loggedIn = bundle.getBoolean("isLoggedIn")
            println(title)

            println(id)
            println(loggedIn)

//            textTitle.text = title
        }


        val a = Android(10)
        a.printCurrentVersion()

    }
}