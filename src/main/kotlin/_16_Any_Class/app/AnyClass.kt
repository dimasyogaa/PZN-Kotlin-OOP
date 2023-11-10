package _16_Any_Class.app

import _16_Any_Class.data.SmartPhone

fun main() {

    val smartPhone = SmartPhone("Samsung S10", "Android")

    println(smartPhone.toString()) // lokasi objek di memory
    println(smartPhone.hashCode())

}