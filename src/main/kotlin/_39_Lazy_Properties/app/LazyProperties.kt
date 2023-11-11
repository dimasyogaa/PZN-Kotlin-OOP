package _39_Lazy_Properties.app

import _39_Lazy_Properties.data.Account

fun main() {
    val account = Account()
    println(account.name) // blok lamba di eksekusi, setelah ini blok lambda tidak dieksekusi,tetapi nilai "Dimas" sudah sudah terassign ke variabel name
    
    println(account.name)
    println(account.name)
    println(account.name)
}