package _28_Extension_Properties.data

/**
 * Selain function, kita juga bisa membuat extension untuk properties di Kotlin
 * Untuk membuat extension properties, kita bisa membuat properties dengan Getter atau Setter
 *
 */

class Student(val name: String, val age: Int)

val Student.upperName: String
    get() = this.name.uppercase()