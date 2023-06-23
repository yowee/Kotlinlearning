package com.example.kotlinlearning2.basic

import java.util.Scanner

// Hello World Program
fun main(args : Array<String>) {
    output()
    input()
    inputUsingScanner()
}

fun output(){
    println("Hello, World!")
}

fun variableAndLiteral(){
    val score = 12.3

    println("score")
    println("$score")
    println("score = $score")
    println("${score + score}")
    println(12.3)
}

fun input(){
    print("Enter text: ")

    val stringInput = readLine()!!
    println("You entered: $stringInput")
}

fun inputUsingScanner(){
    val reader = Scanner(System.`in`)
    print("Enter a number: ")

    var number : Int = reader.nextInt();

    println("You Entered : $number")

}