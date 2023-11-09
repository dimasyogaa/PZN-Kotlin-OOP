package _11_Inheritance.app

import _11_Inheritance.data.Manager
import _11_Inheritance.data.VicePresident

fun main() {
    val manager = Manager("Yoga")
    manager.sayHello("Dimas")

    val vicePresident = VicePresident("Pambudi")
    vicePresident.sayHello("Joko")
}