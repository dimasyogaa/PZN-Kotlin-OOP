package _48_Scope_Functions

import _28_Extension_Properties.data.Student

/**
 * Let function bisa digunakan sebagai reference block agar
 * kita bisa lebih mudah ketika ingin memanipulasi sebuah object
 *
 * Let function memiliki parameter object itu sendiri,
 * sehingga kita bisa menggunakan kata kunci it untuk mendapatkan referensi terhadap object tersebut
 */

fun main() {
    val student = Student("Dimas", 15)

    // basic
    println("BASIC")
    println(student.name)
    println(student.age)

    println()

    // let - 1
    println("let - 1")
    student.let {
        println(it.name)
        println(it.age)
    }

    println()

    // let - 2
    println("let - 2")
    val result = student.let {
        println(it.name)
        println(it.age)
        "Pambudi"
    }
    println(result)

    println()

    // let - 3
    println("let - 3")
    val result3: String = student.let {
        "Name ${it.name}, Age ${it.age}"
    }
    println(result3)

}