package _32_Anonymous_Class.app

import _32_Anonymous_Class.data.Action

/**
 * Saat kita ingin membuat object, maka kita diwajibkan untuk menggunakan deklarasi class yang  lengkap
 * Namun, Kotlin mendukung pembuatan object dari class yang bahkan belum lengkap
 * Bahkan, di Kotlin, kisa bisa membuat object dari interface
 * Kemampuan ini dinamakan anonymous class
 * Untuk membuat anonymous class, kita bisa menggunakan kata kunci object diikuti dengan deklarasi class Child seperti pada pewarisan
 *
 */

fun fireAction(action: Action) {
    action.iniAction()
}

// untuk menjalankan action harus membuat class terlebih dahulu
class SampleAction : Action {
    override fun iniAction() {
        println("This is sample action")
    }
}

fun main() {
    fireAction(SampleAction()) // basic - untuk menjalankan action harus membuat class terlebih dahulu

    println()

    // efektif - anonymous class
    fireAction(object : Action {
        override fun iniAction() = println("Action One")
    })
    fireAction(object : Action {
        override fun iniAction() = println("Action Two")
    })
}