package com.study

    fun main() {
        sum(1,2)
        sum2(2,3)
        noReturnFunction("noReturnFunction")
        noReturnFunction2("noReturnFunction2")

        defaultParameter()

        namedArgument(b="두번째 인자",a="첫번째 인자")

    }

    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun sum2(a: Int, b: Int) = a + b

    fun noReturnFunction(a: String) {
        println(a)
    }

    fun noReturnFunction2(a: String): Unit {
        println(a)
    }

    fun defaultParameter(a: String = "default value") {
        println(a)
    }

    fun namedArgument(a: String, b: String) {
        println("a : $a b: $b");
    }


