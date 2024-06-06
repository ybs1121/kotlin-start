package com.study.clazzSample

fun main(args: Array<String>) {
    var man = Person()
    man.say()
    man.introduce()

    man.age = 20
    man.introduce()

    println("=========================================")

    val jedi = PersonWithConstructor("jedi", 150)
    val flature = PersonWithConstructor("flature")
    val harry = PersonWithConstructor(name = "harry", age = 25, etc = "추가값")

    flature.sayHello()
    flature.introduce()

    jedi.sayHello()
    jedi.introduce()

    harry.sayHello()
    harry.introduce()
}
