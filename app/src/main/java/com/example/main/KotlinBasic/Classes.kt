package com.example.KotlinBasic

import java.util.*

open class Classes  {
    //Benches
    //Book

    open val pi = 22/7

    open fun setUpBenches(a: Int) {
        //this was created by the S/w team
        println("Setting up the benches")
        println("only 20 benches are allowed")

        loopingBenches(a)

    }


    fun loopingBenches(a: Int) {
        for (i in 0..a) {
            println("adding Benches ${i}")
        }
    }


    fun books() {
        println("Allocating books")
    }

}