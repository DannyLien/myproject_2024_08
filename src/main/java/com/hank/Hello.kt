package com.hank


fun main() {
//    println("Kotlin Hello word")
//    Human().hello()
    val h = Human("Tom", weight = 66.5f, height = 1.7f)
    h.hello()
    println(h.bmi())
    println(h.name)
//    var age = 19
//    age = 20
//    var wieght = 66.5f
//    var name: String
//    name = "Hank"
//    val d = Dice()
//    println(d.max)
//    println(d.point)
}

class Human(var name: String = "", var weight: Float, var height: Float) {
    init {
        println("test ${weight}")
    }

//    constructor(naem: String, weight: Float, height: Float) : this(weight, height)

    fun bmi(): Float {
        var bmi = weight / (height * height)
        return bmi
    }

    fun hello() {
        println("Kotlin Human Hello Word")
    }

}

