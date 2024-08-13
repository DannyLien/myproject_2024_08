package com.hank


fun main() {
//    println("Kotlin Hello word")
//    Human().hello()
    val h = Human(66.5f, 1.7f)
    h.hello()
    println(h.bmi())
//    var age = 19
//    age = 20
//    var wieght = 66.5f
//    var name: String
//    name = "Hank"

}

class Human(var weight: Float, var height: Float) {

    fun bmi(): Float {
        var bmi = weight / (height * height)
        return bmi
    }

    fun hello() {
        println("Kotlin Human Hello Word")
    }

}

