package com.study.pratice2

fun main(args: Array<String>) {

    val hd = Car(13.2, 2000, "아반때")
    hd.info()
    println("========")
    val kia = Car(14.2,2100,"K3")
    kia.info()
    println("========")

    Car.compareFuel(hd,kia)
}