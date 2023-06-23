package com.example.kotlinlearning2.basic

//Expression consist of Variable, Operators etc that evaluate to a single value
//Example

fun main() {
    var score : Int
    score = 90 + 25

    expressionExample()
    expressionExampleIf()
    statementExample()


}

fun expressionExample(){
    val score: Int
    score = 90 + 25

    println("this is an example consists variable and operator 90 + 25 and this expression return an Int value")

}


fun expressionExampleIf(){
    val a = 12
    val b = 13
    val max: Int

    max = if (a > b) a else b
    println("$max")

    println("If is expression in Kotlin unlike java " + " \"if (a > b) a else b\" is an expression")
}

fun statementExample(){
    //Statement is that makeup a complete unit of execution
    val score = 90 + 25

    println("Howdy")
    var a = 5
    ++a
    var max : Int = if (a > 4) a else 4
}

fun block(){ //start of block function block
    //A block is a group of statements that are enclosed in {}
        val flag = true

        if (flag == true) {      // start of if block
            print("Hey ")
            print("jude!")
        }                        // end of if block
} // end of block function block