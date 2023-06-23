package com.example.kotlinlearning2.kotlinbasics2
var fishFoodTreats : Int?= 6

fun main() {
    traditionalNull()
    kotlinWayNull()
    chainNullTestElvisOperator()
    notNullAssertionOperator()
}

fun chainNullTestElvisOperator() {
    fishFoodTreats = fishFoodTreats?.dec() ?: 0
}

fun kotlinWayNull() {
    fishFoodTreats = fishFoodTreats?.dec()
}

fun traditionalNull(){
    var fishFoodTreats = 6
    if (fishFoodTreats != null) {
        fishFoodTreats = fishFoodTreats.dec()
    }
}

fun notNullAssertionOperator(){
//    convert to not null value then throw Null pointer exception
//    !! bang bang or double bang operator
//    val s : String? = null
//    val length = s!!.length

    println("Enter anything")
    val x = readLine()!!
    println(x)
}
