package com.example.kotlinlearning2.basic

fun main() {
    arthimeticOperator()
    stringConcatenation()
    assignmentOperator()
    unaryOperator()
    comparisonAndEqualityOperators()
    inOperator()
    indexAsOperator()
    invokeOperator()
}

fun arthimeticOperator(){
    val number1 = 12.5
    val number2 = 3.5

    val a = 12
    val b = 3

    var result: Number


    result = number1 + number2
    println("number1 + number2 = $result")

    result = number1 - number2
    println("number1 - number2 = $result")

    result = number1 * number2
    println("number1 * number2 = $result")

    result = number1 / number2
    println("number1 / number2 = $result")

    result = number1 % number2
    println("number1 % number2 = $result")

    println("a minus b = ${a.minus(b)}")
    println("a plus b = ${a.plus(b)}")
    println("a div b = ${a.div(b)}")
    println("a times b = ${a.times(b)}")
    println("a mod b = ${a.mod(b)}")


}

fun stringConcatenation(){
    val start = "Talk is cheap. "
    val middle = "Show me the code. "
    val end = "- Linus Torvalds"

    val result = start + middle + end
    println(result)

}

fun assignmentOperator(){
    var number = 12

    number *= 5   // number = number*5
    println("number  = $number")
}

fun unaryOperator(){
    val a = 1
    val b = true
    var c = 1

    var result : Int
    var booleanResult: Boolean

    result = -a

    println("-a {$result}")

    booleanResult = !b
    println("!b = $booleanResult")

    --c
    println("--c = $c")

}

fun comparisonAndEqualityOperators(){
    val a = -12
    val b = 12

    val max = if(a>b){
        a
    }
    else b
    // use of greater than operator


    println("max = $max")
}

fun logicalOperators(){
    val a = 10
    val b = 9
    val c = -1
    val result: Boolean

    // result is true is a is largest
    result = (a>b) && (a>c) // result = (a>b) and (a>c)
    println(result)
}

fun inOperator(){
    val numbers = intArrayOf(1, 4, 42, -3)

    if(4 in numbers)
        println(" 4 is in number")
}

fun indexAsOperator(){
    val a  = intArrayOf(1, 2, 3, 4, - 1)
    println(a[1])
    a[1]= 12
    println(a[1])
}

fun invokeOperator(){
    indexAsOperator();
}