package com.study.pratice1

fun main(args: Array<String>) {
    val calculator = Calculator(1, 2)
    calculator.add()
    calculator.sub()
    calculator.multiply()
    calculator.div()

    val calculator2 = Calculator(1, 0)
    calculator2.add()
    calculator2.sub()
    calculator2.multiply()
    calculator2.div()
}
