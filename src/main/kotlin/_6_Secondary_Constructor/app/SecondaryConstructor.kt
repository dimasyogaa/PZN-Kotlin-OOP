package _6_Secondary_Constructor.app

import _6_Secondary_Constructor.data.a_dengan_primary_constructor.Car
import _6_Secondary_Constructor.data.b_tanpa_primary_constructor.Address

fun main() {
    // dengan primary constructor
    val avanza = Car("Toyota")
    val almaz = Car("Wuling", "Almaz")

    println(avanza.brand)
    println(avanza.year)
    println(almaz.brand)
    println(almaz.year)

    println()

    // tanpa primary constructor
    val address = Address("Jalan A", "Jakarta")
    val address2 = Address("Jalan A", "Jakarta", "Indonesia")

    println(address.street)
    println(address2.street)
}