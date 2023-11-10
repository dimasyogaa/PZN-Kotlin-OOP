package _25_Interface.app

import _25_Interface.data.Human
import _25_Interface.data.Human2
import _25_Interface.data.Human3

fun main() {

    val human = Human("Dimas")
    human.sayHello("Joko")
    human.sayHelloConcrete("Nugroho")
    human.go()

    println()

    val human2 = Human2("Dimas")
    human2.sayHello("Joko")
    human2.sayHelloConcrete("Nugroho")
    human2.go()

    println()

    val human3 = Human3("Yoga")
    human3.move()

}