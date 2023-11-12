package _48_Scope_Functions

import _28_Extension_Properties.data.Student

/**
 * Also function mirip dengan let function
 * Yang membedakan adalah, pada also function, return value nya adalah reference ke object itu sendiri
 *
 */

fun main() {
    val student = Student("Pambudi", 15)

    val result: Student = student.also {
        "Name ${it.name}, Age ${it.age}"
    }
    println(result)
}