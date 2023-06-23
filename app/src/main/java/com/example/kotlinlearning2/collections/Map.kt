package com.example.kotlinlearning2.collections

fun main() {
    val scores = mutableMapOf<String, Int>("bob" to 90 , "alice" to 32, "adam"  to 99)

    println(scores)

    scores["adam"] = 123
}

