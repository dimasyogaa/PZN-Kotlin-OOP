package _40_Observable_Properties.app

import _40_Observable_Properties.data.Account

fun main() {
    val account = Account()

    account.description = "Contoh"
    account.description = "Diubah"
    account.description = "Hello World"
}