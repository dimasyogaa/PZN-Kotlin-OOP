package _12_Function_Overriding.app

import _12_Function_Overriding.data.Manager
import _12_Function_Overriding.data.VicePresident

fun main() {
    val manager = Manager("Yoga")
    manager.sayHello("Dimas")

    val vicePresident = VicePresident("Pambudi")
    vicePresident.sayHello("Joko")
}