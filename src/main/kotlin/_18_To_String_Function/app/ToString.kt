package _18_To_String_Function.app

import _18_To_String_Function.data.User

fun main() {
    val user = User("Dimas", "Rahasia")
    val user2 = User("Dimas", "Rahasia")

    println(user) // auto menjalankan override function to string
    println(user2)
}
/**
 * Jika tidak override toSting
 * maka yang dikembalikan alamat memori
 */