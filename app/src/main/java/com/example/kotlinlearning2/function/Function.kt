package com.example.kotlinlearning2.function

import java.util.Random

//compact function
fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"

fun main(args: Array<String>) {
    println("Hello, ${args[0]}")
    //In kotlin Everything has a value
    // Will assign kotlin.Unit
    val isUnit = println("This is an expression")
    println(isUnit)

    val temperature = 10
    val isHot = if (temperature > 50) true else false
    println(isHot)
    println()
    val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK" }."
    println(message)

    feedTheFish()
    println()

    swim()   // uses default speed
    swim("slow")   // positional argument
    swim(speed="turtle-like")   // named parameter

    println()

}

fun fishFood (day : String) : String {
    return when (day) {
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "nothing"
    }
}


fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println ("Today is $day and the fish eat $food")
    println("Change water: ${shouldChangeWater(day)}")
}
fun randomDay(): String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
   return week[Random().nextInt(7)]
}
fun swim(speed: String = "fast") {
    println("swimming $speed")
}
fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else  -> false
    }
}