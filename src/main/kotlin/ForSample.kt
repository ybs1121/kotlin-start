package com.study

class ForSample {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            for (i in 1..10) println(i)
            println()
            for (i in 10 downTo 1) println(i)
            println()
            for (i in 10 downTo 1 step 2) println(i)
        }
    }
}