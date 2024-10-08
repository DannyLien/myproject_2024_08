package com.kotlin

import java.util.Random

data class Ticket(val origin: Int, val destination: Int, val price: Int)

fun main() {
    var ticket = Ticket(20, 51, 420)
    val s = "abcdef"
    println(s.validate())
    println((1..10).random())

}

fun String.validate(): Boolean {
    return this.length > 6;
}

fun IntRange.random():Int{
    val r = Random().nextInt(endInclusive-start)+start
    return r
}


