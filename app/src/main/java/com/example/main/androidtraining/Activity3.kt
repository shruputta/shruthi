package com.example.androidtraining

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.KotlinBasic.School
import com.example.myapplication.R

class Activity3 : AppCompatActivity() {

    val school: School = School()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)


        school.setUpBenches(40)





    }
}