package com.study.inheritance

import java.time.LocalDate

fun main(args: Array<String>) {

    val gv70 = MyCar("GV70",100.10,"Hyundai", LocalDate.now().minusDays(10))
    val gv80 = Car("GV80",150.10,"Hyundai")

    gv70.introduce()
    gv70.howMuch()
    gv70.myPurchaseDate()
    println("=====================")
    gv80.introduce()
    gv80.howMuch()
    gv80.myPurchaseDate()
}