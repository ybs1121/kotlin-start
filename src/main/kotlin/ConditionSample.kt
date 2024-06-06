package com.study

class ConditionSample {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var max = 10
            var i = 1
            if (i < max) {
                println("max is $max")
            }
            // 조건 Java switch 같은 느낌

            var testType = 1
            when (testType) {
                1 -> println("testType is 1")
                2 -> println("testType is 2")
            }

            // 범위
            var testType2 = 1
            when (testType) {
                in 1..10 -> println("testType2 is 1")
                in 11..20 -> println("testType2 is 2")
            }
        }
    }
}
