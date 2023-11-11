package _34_Singletone_Object.data

/** 1
 * Salah satu konsep Design Pattern yang sangat populer adalah singleton object
 * Singleton object adalah object yang hanya dibuat satu kali
 * Di Kotlin, membuat object singleton sangat mudah, hanya dengan menggunakan kata kunci object
 * Cara membuat singleton object di Kotlin sama seperti membuat class
 * Singleton object mirip dengan class, bisa extends class ataupun interface
 * Namun singleton object tidak memiliki constructors
 *
 *
 */

object Utilities {

    var name: String = "My Utilities"

    fun toUpper(value: String): String {
        return value.uppercase()
    }

}
