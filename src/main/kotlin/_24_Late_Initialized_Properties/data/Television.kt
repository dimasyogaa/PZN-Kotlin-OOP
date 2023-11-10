package _24_Late_Initialized_Properties.data


/**
 * Standarnya, properties di Kotlin wajib di inisialisasi di awal saat deklarasi properties tersebut
 * Namun di Kotlin kita juga bisa menunda inisialisasi data para properties
 * Dengan menggunakan kata kunci lateinit, kita bisa membuat properties tanpa harus langsung mengisi datanya
 * Kata kunci lateinit hanya bisa digunakan di var, tidak bisa digunakan di val
 *
 */

class Television {

    lateinit var brand: String

    fun initTelevision(brand: String) {
        this.brand = brand
    }

}