package _17_Type_Check_Cast.app

import _16_Any_Class.data.HandPhone
import _16_Any_Class.data.Laptop


fun printObject(any: Any) {

    if (any is Laptop) {
        println("Laptop with name ${any.name}")
    } else if (any is HandPhone) {
        println("HandPhone with name ${any.name}")
    } else {
        println(any)
    }

    // println(any)
}

fun printObjectWithWhen(any: Any) {
    when (any) {
        is Laptop -> println("Laptop with name ${any.name}")
        is HandPhone -> println("HandPhone with name ${any.name}")
        else -> println(any)
    }
}

fun printString(any: Any) {
    val value = any as String // unsafe cast
    println(value)
}

// safe nullable cast
fun printStringSafe(any: Any) {
    val value = any as? String // safe nullable cast -> jika tidak bisa di cast akan return null
    println(value)
}

fun main() {
    printObjectWithWhen("Dimas")
    printObjectWithWhen(1)
    printObjectWithWhen(Laptop("Acer"))
    printObjectWithWhen(HandPhone("Samsung"))

    println()

    printString("Dimas")
    // printString(8) // class java.lang.Integer cannot be cast to class java.lang.String

    println()

    printStringSafe("Pambudi")
    printStringSafe(8) // null
}