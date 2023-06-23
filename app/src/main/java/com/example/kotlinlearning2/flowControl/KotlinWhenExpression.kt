package com.example.kotlinlearning2.flowControl

import java.util.Scanner

//When is replacement for Java Switch statement It evaluates a section of code among many alternatives.

fun main() {
   whenExample()
    isOperator(15)
}

fun whenExample() {
    val a = 12
    val b = 5

    println("Enter operator either +, -, * or /")
    val operator = readLine()

    val result = when (operator) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b
        else -> "$operator operator is invalid operator."
    }

    println("result = $result")

}

fun fewPossibilities(){
    val n = -1

    when (n) {
        1, 2, 3 -> println("n is a positive integer less than 4.")
        0 -> println("n is zero")
        -1, -2 -> println("n is a negative integer greater than 3.")
    }
}


fun inTheRange(){
    val a = 100

    when (a) {
        in 1..10 -> println("A positive number less than 11.")
        in 10..100 -> println("A positive number between 10 and 100 (inclusive)")
    }

}

fun isOperator(x : Any){
    when (x ) {
        is Int -> print(x + 1)
        is String -> print(x.length + 1)
        is IntArray -> print(x.sum())
    }
}