package com.example.kotlinlearning2.collections

fun main() {
    val vowles = setOf<Char>('a', 'e', 'i', 'o', 'u')
    println(vowles)
    println(vowles.contains('e'))

    val vowelsChange  = mutableSetOf('a' , 'e', 'i', 'o','u')
    vowelsChange.add('e')
    vowelsChange.add('z')
    println(vowelsChange.contains('e'))
    //letinit --- lazy :: !! ?: ?. scope  --- command option T

}

