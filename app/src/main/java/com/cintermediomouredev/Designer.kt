package com.cintermediomouredev

class Designer(name: String, age: Int) : Person(name, age) {
    override fun work() {
        //super.work()
        println("${name} persona esta disenando")
    }
}