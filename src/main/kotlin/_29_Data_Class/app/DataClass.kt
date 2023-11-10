package _29_Data_Class.app

import _29_Data_Class.data.Product

/**
 * Kadang kita sering membuat class yang hanya digunakan sebagai representasi dari data
 * Data Class cocok digunakan dalam hal ini
 * Data Class merupakan class yang secara otomatis akan membuatkan function equals, hashCode, toString dan copy dari semua properties yang terdapat di primary constructors yang dimiliki oleh data class
 *
 * Data class memiliki function copy yang bisa digunakan untuk menduplikasi object.
 * Bahkan metode copy yang terdapat di data class bisa digunakan untuk menduplikasi sekaligus mengubah properties nya
 *
 */

fun main() {
    val product = Product("Indomie", 2500, "Food")

    val product2 = product.copy()

    val product3 = product.copy(name = "Supermi")

    val product4 = Product("Indomie", 2500, "Food")

    println(product)
    println(product2)
    println(product3)

    println()

    println(product == product2) // true

    println(product == product3) // false

    println(product == product4) // true
    println(product.hashCode() == product4.hashCode()) // true
}