package _30_Sealed_Class.app

import _30_Sealed_Class.data.Minus
import _30_Sealed_Class.data.Modulo
import _30_Sealed_Class.data.Operation
import _30_Sealed_Class.data.Plus


/**
 *  * Sealed class sangat berguna saat kita menggunakan when expression
 *  * Dengan menggunakan sealed class, kita bisa membatasi hanya class turunannya yang perlu di check
 *  *
 */

fun operation(value1: Int, value2: Int, operation: Operation): Int {
    return when (operation) {
        is Plus -> value1 + value2
        is Minus -> value1 - value2
        is Modulo -> value1 % value2
    }
}

fun main() {
    println(operation(10, 10, Plus()))
    println(operation(10, 5, Minus()))
    println(operation(10, 3, Modulo()))
}