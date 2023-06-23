package com.example.kotlinlearning2.basic
import java.math.BigInteger

fun main() {
    val number1: Int = 545344
    val number2: Byte = number1.toByte()
    println("number1 = $number1")
    println("number2 = $number2")
    toLong()

    val n = 10
    val first = BigInteger("0")
    val second = BigInteger("1")

    println(fibonacci(n, first, second))


}

fun toLong(){
    val number1: Int = 55
    val number2: Long = number1.toLong()

    println(number2)
}



tailrec fun fibonacci(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    return if (n == 0) a else fibonacci(n-1, b, a+b)
}