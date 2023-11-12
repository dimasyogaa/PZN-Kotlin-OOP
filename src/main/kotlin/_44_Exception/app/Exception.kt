package _44_Exception.app

import _44_Exception.data.ValidationException

/** 1 - Membuat Exception
 * Untuk membuat error di Kotlin sangatlah mudah,
 * kita bisa menggunakan kata kunci throw, diikuti dengan object error nya
 */
fun validateAndSayHello(name: String) {
    if (name.isBlank()) {
        throw ValidationException("Name is blank")
    } else {
        println("Hello $name")
    }
}

fun noTryCatch() {
    validateAndSayHello("Dimas")
    validateAndSayHello("") // Exception in thread "main" _44_Exception.data.ValidationException: Name is blank
}

/** 2 Try Catch
 * Jika dalam program Kotlin kita terjadi exception, maka secara otomatis program kita akan terhenti
 * Kadang kita tidak ingin sampai kejadian seperti itu
 * Di Kotlin, kita bisa menangkap exception, lalu melakukan sesuatu jika terjadi error
 * Try Catch di Kotlin digunakan untuk mencoba melakukan sesuatu,
 * jika terjadi error maka akan ditangkap dan kita bisa memberi reaksi sesuai dengan yang kita mau
 *
 */

fun tryCatch() {
    try {
        validateAndSayHello("Dimas")
        validateAndSayHello("") // ini error, langsung ditangkap oleh blok catch sehingga kode dibawah ini di dalam blok try tidak dieksekusi
        println("Program") // tidak dieksekusi
    } catch (error: ValidationException) {
        println("Terjadi Error ${error.message}")
    }
}

/** 3 - 4 Multiple Catch
 * Saat kita mengeksekusi sebuah kode program di blok Try,
 * bisa dimungkinan tidak hanya terjadi satu jenis exception, bisa saja terjadi beberapa jenis exception
 * Di Kotlin, kita bisa menggunakan multiple block Catch, untuk menangkap jenis exception yang berbeda
 *
 * Finally adalah block kode yang bisa ditambahkan di Try Catch
 * Block finally akan selalu dieksekusi setelah kode program Try Catch di eksekusi, baik itu sukses ataupun gagal
 * Ini cocok untuk menempatkan kode yang memang harus dilakukan tidak peduli baik itu kodenya sukses atau gagal
 *
 */

fun tryMultiCatchFinally() {
    try {
        validateAndSayHello("Dimas")
        validateAndSayHello("")
        println("Program")
    } catch (error: ValidationException) {
        println("Terjadi Error ValidationException : ${error.message}")
    } catch (error: Throwable) {
        println("Terjadi Error ${error.message}")
    } finally {
        println("Program Selesai")
    }
}


fun main() {

    // 1
    // noTryCatch()

    // 2
    // tryCatch()

    // 3 - 4
    tryMultiCatchFinally()


}

