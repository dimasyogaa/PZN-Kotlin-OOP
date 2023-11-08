package _9_Function_Overloading.app

import _9_Function_Overloading.data.Person

fun main() {
    val yoga = Person()
    yoga.firstName = "Yoga"

    yoga.sayHello("Afrizal")
    yoga.sayHello("Joko", "Nugroho")
}