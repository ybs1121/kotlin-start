package com.study.inheritance

open class Car(val name: String, var price: Double, val brand: String) {

    fun introduce() {
        println("this car name is $name and brand by  $brand")
    }

    fun howMuch() {
        println("this car us $price dollars")
    }

    open fun myPurchaseDate() {
        println("you are not buy yet")
    }
}