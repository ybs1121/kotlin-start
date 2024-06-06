package com.study.pratice1

class Calculator constructor(val a: Int, val b: Int) {

    fun add() {
        var result = a + b
        println("add result is $result")
        println()
    }

    fun sub()  {
        var result = a - b
        println("sub result is $result")
        println()
    }

    fun multiply()  {
        var result = a * b
        println("multiply result is $result")
        println()
    }

    fun div()  {
        if (b == 0) {
            println("Can't divide 0")
            println()
            return
        }
        var result = a / b
        println("div result is $result")
        println()
    }
}
