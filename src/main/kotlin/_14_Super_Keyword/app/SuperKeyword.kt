package _14_Super_Keyword.app

import _14_Super_Keyword.data.Rectangle

fun main() {
    val rectangle = Rectangle()
    println("Corner ${rectangle.corner}")
    println("ParentCorner ${rectangle.parentCorner}")
    rectangle.printName()
}