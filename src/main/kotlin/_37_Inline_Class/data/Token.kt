package _37_Inline_Class.data

/**
 * Kadang kita hanya membuat class dengan satu properties
 * Terlalu banyak class akan ada konsekuensinya, yaitu memakan konsumsi memory yang lebih banyak ketika program kita berjalan
 * Kotlin memiliki kemampuan untuk mengubah class menjadi inline dengan menggunakan kata kunci inline
 * syarat : harus memiliki 1 properties
 */

// depreceated
// inline class Token(val value: String) {
//     fun toUpper(): String = value.uppercase()
// }

@JvmInline
value class Token(val value: String) {
    fun toUpper(): String = value.uppercase()
}