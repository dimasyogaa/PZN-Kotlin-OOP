package _48_Scope_Functions

import _28_Extension_Properties.data.Student

/**
 * Run function mirip dengan let function
 * Yang membedakan adalah,
 * pada run function, tidak ada parameter pada lambda nya,
 * sehingga kita tidak bisa mengakses reference object menggunakan kata kunci it.
 * Namun kita masih bisa menggunakan kata kunci this
 *
 */

fun main() {
    val student = Student("Dimas", 15)

    // extension function
    val result: String = student.run {
        "Name ${this.name}, Age ${this.age}"
    }
    println(result)

    println()

    // no extension function
    val result2: String = run {
        "Yoga Dimas Pambudi"
    }
    println(result2)
}