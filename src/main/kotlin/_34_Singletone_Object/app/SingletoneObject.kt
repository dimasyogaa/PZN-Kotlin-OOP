package _34_Singletone_Object.app

import _34_Singletone_Object.data.Application
import _34_Singletone_Object.data.Application2
import _34_Singletone_Object.data.Utilities

fun main() {
    println(Utilities.name)
    println(Utilities.toUpper("Dimas"))

    println()

    Utilities.name = "Dirubah"
    a()
    b()

    println()

    println(Application.Utilities.toUpper("yoga"))
    println(Application2.Application2.toUpper("yeo"))
}

fun a() {
    println(Utilities.name)
}

fun b() {
    println(Utilities.name)
}