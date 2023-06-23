package com.example.kotlinlearning2.kotlinbasics2

import java.util.Arrays

fun main() {
    val school = listOf("mackerel", "trout", "halibut")
    println(school)

    var myList = mutableListOf("tuna" ,"salmon", "shark")
    myList.remove("shark");
    println(myList)

    //array
    val school1 = arrayOf("tuna", "salmon","minnow")
    println(Arrays.toString(school1))

    //mixed type
    val mix = arrayOf("fish", 2)

    //one type for all element
    val numbers = intArrayOf(1,2,3,4)
    println(Arrays.toString(numbers))

    //combine two arrays
    val numbers2 = intArrayOf(1,2,3)
    val numbers3 = intArrayOf(4,5,6)
    val foo2 = numbers3 + numbers2
    println(foo2[5])

    val numbers4 = intArrayOf(1, 2, 3)
    val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(numbers4, oceans, "salmon")
    println(oddList)

    //array init
    val array : Array<Int> = Array(5) {it*2}
    println(Arrays.toString(array))

    //Loops
    //for loops
    for (element in school) println(element)
    for ((index, element) in school.withIndex())    println("Item at $index is $element\n")
    println("In")
    for (i in 1..5) print("$i ")
    println("\n\nDown to /n")
    for (i in 5 downTo 1) print("$i ")
    println("\n\nStep")
    for (i in 5 downTo 1 step 2) print("$i ")
    println("\n\nCharacter")
    for (i in 'd'..'g') print("$i ")
    println("\n\nReplay")

    repeat(5,{ print("$it ") })
    println("\n\nWhile loops")
    var bubbles = 1
    while (bubbles<=50){
        print("$bubbles ")
        bubbles++
    }

    println("\n\n Do While loops")
    do {
        print("$bubbles ")
        bubbles--
    } while (bubbles>=1)
    //while loops


}