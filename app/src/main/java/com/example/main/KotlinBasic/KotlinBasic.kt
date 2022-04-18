package com.example.KotlinBasic

class KotlinBasic {

    fun print() {
        println("Printing....")
//        add()
//        add('a')

//        add(10, 20)

//        add("Hi", "Hello")
        add('z', 654)


    }

    fun add() {
        val a = 50
        val b = 20
        println(a + b)

    }

    fun add(a: Int) {
        val b = 30
        println(a + b)
    }

    fun add(b: String) {
        println(b)
    }

    fun add(a: Char) {
        println(a)

    }

    fun add(a: Int, b: Int) {
        println(a + b)
    }

    fun add(a: String, b: String) {
        //Concatination
        println(a + " " + b)

    }

    fun add(a: Char, b: Int) {
        println(a + b)
    }



}