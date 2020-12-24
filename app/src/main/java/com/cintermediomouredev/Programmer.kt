package com.cintermediomouredev

class Programmer(name: String, age: Int, val language: String) : Person(name, age), Vehicle {
    override fun work(){
        //super.work()
        println("${name} está programando")
    }

    fun sayLanguage(){
        println("${name} programa en ${language}")
    }

    override fun drive() {
        println("${name} persona maneja")
    }
}