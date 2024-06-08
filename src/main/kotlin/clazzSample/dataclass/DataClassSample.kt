package com.study.clazzSample.dataclass

data class DataClassSample(var name: String, var age: Int)
class NoDataClassSample(var name: String, var age: Int)

fun main(args: Array<String>) {

    val data1 = NoDataClassSample("A", 10)
    val data2 = NoDataClassSample("A", 10)

    println(data1.hashCode())
    println(data2.hashCode())

    println(data1 == data2)
    println(data1.toString())

    println("=================")

    val data3 = DataClassSample("A", 10)
    val data4 = DataClassSample("A", 10)

    println(data3.hashCode())
    println(data4.hashCode())
    println(data3 == data4)
    println(data3.toString())
    println("name is = ${data3.component1()}")
    println("age is = ${data3.component2()}")

    val (name, age) = data3

    val data5 = data3.copy()
    val data6 = data3.copy(name = "C")
    println(data5 == data3)
    println(data6 == data3)

}