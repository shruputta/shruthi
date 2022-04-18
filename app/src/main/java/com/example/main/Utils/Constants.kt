package com.example.Utils

import kotlin.random.Random

public class Constants {

    fun printMyAddress() {
        println("Hi, Sujith")
    }

    fun generateOTP(): Int {
        val random = java.util.Random();
        return random.nextInt(10)
    }

    fun sec() {

    }

    fun setUpMyHost(): String {
        val MY_HOST = "https://facebook.com/"
        return MY_HOST
    }
}