package com.example.kotlinlearning2.basic

fun main() {
    var language: String      // variable declaration of type String
    language = "French"       // variable initialization
    val score: Int          // variable declaration of type Int
    score = 95             // variable initialization

    byte()
    short()
    int()
    long()
    double()
    float()
    number()
    boolean()
}
fun byte(){
    val range: Byte = 88
    println("$range")
}
fun short(){
    val temperature: Short = -16161
    println("$temperature")
}

fun int(){
    val score =  32323232
    println("$score")
}

fun long(){
    val highestScore: Long = 1000000000000000000L

    println("$highestScore")
}

fun double(){
    // distance is of type Double
    val distance = 999.5
    println("$distance")
}

fun float(){
    // distance is of type Float
    val distance = 19.5F
    println("$distance")
}

fun number(){
    var test: Number = 12.2
    println("$test")

    test = 12
    // Int smart cast from Number
    println("$test")

    test = 120L
    // Long smart cast from Number
    println("$test")
}

fun char(){
    val letter: Char
    letter = 'k'
    println("$letter")
}

fun boolean(){
    val flag = true
    println("$flag")

}