package com.example.KotlinBasic
//child --> school
//paret ---> Classes
class School : Classes() {

    //Classes
    //Teachers
    //Student

    //this.

    //super clases


    fun main() {
//        setUpBenches()
//        this.setUpBenches()
    }

    override fun setUpBenches(a: Int) {
        println("want to add more benches")
        println("40 benches are allocated")
        super.setUpBenches(a)

    }

}