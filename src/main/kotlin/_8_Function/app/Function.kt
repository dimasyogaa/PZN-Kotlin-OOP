package _8_Function.app

import _8_Function.data.Person

fun main() {
    val yoga = Person()
    yoga.firstName = "Yoga"
    yoga.middleName = "Dimas"
    yoga.lastName = "Pambudi"

    yoga.sayHello("Afrizal")
    yoga.run()

    val fullName = yoga.getFullName()
    println(fullName)
}