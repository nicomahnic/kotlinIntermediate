package com.cintermediomouredev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //

        //Leccion 1 ENUM
        //Leccion 2 NESTED & INNER CLASS
        //Leccion 3 HERENCIA
        classInheritance()

    }

    //Leccion 3 HERENCIA
    private fun classInheritance(){
        val programador = Programmer("Nicolas", 26, "Kotlin")
        programador.work()   //heredada de Person
        programador.sayLanguage()// propia de Programmer
        programador.goToWork() //heredada de Person que hereda del abstract Work
        programador.drive() // hereda de la interface Vehicle

        val disenador = Designer("Juan", 30)
        disenador.work()
        disenador.goToWork()
    }
}