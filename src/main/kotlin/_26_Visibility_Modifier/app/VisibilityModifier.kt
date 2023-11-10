package _26_Visibility_Modifier.app

import _26_Visibility_Modifier.data.SuperTeacher
import _26_Visibility_Modifier.data.Teacher

/**
 * Class, Interface, Constructor, Function, dan Properties (termasuk Getter dan Setter) bisa memiliki Visibility Modifiers di Kotlin
 * Ada 4 visibility modifiers di kotlin, yaitu: public, private, protected, internal
 * Secara standar visibility modifiers di kotlin adalah public
 *
 *
 */

fun main() {

    val teacher = Teacher("Dimas")
    println(teacher.name)
    // teacher.teach() // error - private

    println()

    val superTeacher = SuperTeacher("Dimas")
    println(superTeacher.name)
    // teacher.test // error - protected

}