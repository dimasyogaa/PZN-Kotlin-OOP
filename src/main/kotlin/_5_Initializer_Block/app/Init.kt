package _5_Initializer_Block.app

import _5_Initializer_Block.data.Car

fun main() {
    val avanza = Car("Toyota")
    val almaz = Car("Wuling", 2019)

    println(avanza.brand)
    println(avanza.year)
    println(almaz.brand)
    println(almaz.year)
}