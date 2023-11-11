package _36_Type_Alias.app

import _35_Companion_Object.data.Application

/**
 * Kotlin mendukung Type Alias
 * Type Alias adalah membuat nama berbeda dari tipe data yang telah ada
 * Biasanya ini digunakan ketika ada tipe data dengan nama yang sama, atau untuk mempersingkat tipe data sehingga kita tidak perlu menulisnya terlalu panjang
 *
 */

typealias App = Application
typealias Aplikasi = App
typealias App2 = _36_Type_Alias.data2.Application


/**
 * Type Alias tidak hanya bisa digunakan untuk class saja, namun bisa untuk function
 * Dengan menggunakan Type Alias untuk function, kita akan lebih mudah saat menggunakan function sebagai parameter, karena lebih sederhana
 *
 */
typealias StringSupplier = () -> String
fun sayHello(supplier: StringSupplier) {
    println("Hello ${supplier()}")
}

fun main() {
    val app = App("Kotlin App")
    val aplikasi = Aplikasi("Kotlin App")
    val app2 = App2("Kotlin App v2")

    sayHello { "Dimas" }
}