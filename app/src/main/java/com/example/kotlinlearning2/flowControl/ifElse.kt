package com.example.kotlinlearning2.flowControl

fun main() {

}

fun traditionalIf(){
    val number = -10

    if (number > 0) {
        print("Positive number")
    } else {
        print("Negative number")
    }
}

fun kotlinIf(){


        val number = -10

        val result = if(number > 0)
            "Positive Number"
            else
                "Negative Number"

    print(result)
}

fun ifBlockLastExpression(){
    //the last value of the expression will be returned in if block

    val a = -9
    val b = -11

    val max = if (a > b) {
        println("$a is larger than $b.")
        println("max variable holds value of a.")
        a
    } else {
        println("$b is larger than $a.")
        println("max variable holds value of b.")
        b
    }
    println("max = $max")
}

fun elseIfLadder(){
    val number = 0

    val result = if (number > 0)
        "positive number"
    else if (number < 0)
        "negative number"
    else
        "zero"

    println("number is $result")
}

fun nestedIf(){
    val n1 = 3
    val n2 = 5
    val n3 = -2

    val max = if (n1 > n2) {
        if (n1 > n3)
            n1
        else
            n3
    } else {
        if (n2 > n3)
            n2
        else
            n3
    }

    println("max = $max")
}