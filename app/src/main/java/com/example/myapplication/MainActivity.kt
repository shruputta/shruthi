package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val uname="Shruthi"
        val pword="123"
        val username=findViewById<EditText>(R.id.etusername)
       val password=findViewById<EditText>(R.id.etpassword)
        val btn=findViewById<Button>(R.id.button)
        btn.setOnClickListener {

            val txtusername = username.text
            val txtpassword= password.text
         //   val compareusername =uname.equals(txtusername)
           //val comparepassword=pword.equals(txtpassword) //return boolean value
            if(txtusername.toString()==uname) {


                if (txtpassword.toString()==pword) {
                    Toast.makeText(this, "valid user", Toast.LENGTH_LONG).show()

                } else {
                    Toast.makeText(this, "Invalid user", Toast.LENGTH_LONG).show()



                }

            }
                else
                {

                    Toast.makeText(this, "Username doesnt match ", Toast.LENGTH_LONG).show()

                }
            }
        }

    }
