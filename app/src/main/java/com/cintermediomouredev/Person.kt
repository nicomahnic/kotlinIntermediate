package com.cintermediomouredev

open class Person(override val name: String, age: Int): Work() {
    // Todas las clases heredan de la clase Any (algo propio de Kotlin)

    open fun work(){
        println(" ${name} está trabajando")
    }

    override fun goToWork() {
        println("${name} va al trabajo")
    }
}