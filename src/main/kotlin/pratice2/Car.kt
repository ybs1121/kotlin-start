package com.study.pratice2

class Car constructor(
    val fuelEfficiency: Double,
    val price: Int,
) {
    var modelName = "no value"

    constructor(fuelEfficiency: Double, price: Int, modelName: String) : this(fuelEfficiency, price) {
        this.modelName = modelName
    }


    fun info() {
        println("Name : $modelName ")
        println("Price $price")
        println("fuel Eff : $fuelEfficiency")
    }


    // Static Method 구현
    companion object {
        fun compareFuel(carA: Car, carB: Car) {
            if (carA.fuelEfficiency > carB.fuelEfficiency) {
                println("${carA.modelName} is Better fuelEfficiency")
            } else if (carA.fuelEfficiency < carB.fuelEfficiency) {
                println("${carB.modelName} is Better fuelEfficiency")
            } else {
                println("fuelEfficiency Draw")
            }
        }

    }
}
