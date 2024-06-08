package com.study.enums

enum class Color(var lebel: String, val code: String) {
    RED("red", "#FE2E2E2"),
    YELLOW("yellow", "#F7FE2E"),
    GREEN("green", "#40FF00"),
    BLUE("blue", "#0000FF"),
}

enum class HttpStatus(var label: String, var code: Int) {
    REDIRECT("redirect", 301) {
        override fun isServerError(): Boolean {
            return false
        }
    },NOT_FOUND("not found", 404) {
        override fun isServerError(): Boolean {
            return false
        }
    },SERVER_ERROR("server error", 500) {
        override fun isServerError(): Boolean {
            return true
        }
    };

    abstract fun isServerError(): Boolean

}

enum class HttpStatus2(var label: String, var code: Int) :CheckStatus{
    REDIRECT("redirect", 301) {
        override fun isServerError(): Boolean {
            return false
        }
    },NOT_FOUND("not found", 404) {
        override fun isServerError(): Boolean {
            return false
        }
    },SERVER_ERROR("server error", 500) {
        override fun isServerError(): Boolean {
            return true
        }
    };



}

interface CheckStatus {
    fun isServerError(): Boolean
}
fun main(args: Array<String>) {
    var red = Color.RED
    var yellow = Color.YELLOW
    var green = Color.GREEN
    println(red)
    println(red.toString())
    println(red.code)
    println(red.lebel)
    println("=======================")
    for (color in Color.values()) {
        println(color.code)
        println(color.lebel)
        println("---next---")
    }
}

