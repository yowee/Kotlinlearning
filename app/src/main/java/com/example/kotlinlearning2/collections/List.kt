package com.example.kotlinlearning2.collections

fun main() {
    val numbers = listOf(1,2,3,4,5)
    println(numbers)

    val numbersChanges = mutableListOf(1,2,3,4,5)
    println(numbersChanges)
    numbersChanges.add(6)
    numbersChanges[2] = 10
    println(numbersChanges)
    numbersChanges.sort()
    println(numbersChanges)
}

