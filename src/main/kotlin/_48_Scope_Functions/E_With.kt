package _48_Scope_Functions

import _28_Extension_Properties.data.Student

/**
 * With function mirip dengan run function, menggunakan reference this
 * Yang membedakan adalah, with function bukanlah extension function,
 * jadi tidak bisa digunakan langsung dari object-nya
 * Kita harus memanggil with function secara manual
 *
 */

fun main() {
    val student = Student("Dimas", 15)

    val result: String = with(student) {
        "Name ${this.name}, Age ${this.age}"
    }
    println(result)
}

