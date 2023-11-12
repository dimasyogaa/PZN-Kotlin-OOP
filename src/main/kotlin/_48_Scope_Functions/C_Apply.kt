package _48_Scope_Functions

import _28_Extension_Properties.data.Student

/**
 * Apply function hampir sama dengan run function
 * Yang membedakan adalah return value dari apply function ada reference object itu sendiri
 *
 */

fun main() {
    val student = Student("Pambudi", 15)

    val result: Student = student.apply {
        "Name ${this.name}, Age ${this.age}"
    }
    println(result)

}