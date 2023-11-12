package _44_Exception.data

/** 0 - Membuat Exception
 * Saat membuat program, kita pasti akan selalu berhadapan dengan error
 * Banyak sekali jenis error, baik itu error yang sudah diduga, seperti validation error,
 * atau error yang tidak terduga, seperti ada jaringan error, koneksi ke database error, dan lain-lain
 * Error di Kotlin direpresentasikan dengan Exception, dimana semua tipe data error pasti akan selalu class turunan dari Throwable
 *
 */

class ValidationException(message: String): Throwable(message) {
}