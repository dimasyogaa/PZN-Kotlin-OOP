package _7_Properties_di_Constructor.app

import _7_Properties_di_Constructor.data.User

fun main() {

    val user1 = User("Yoga", "Rahasia")
    val user2 = User("Joko", "Rahasia123")

    user1.username = "Dimas"
    user1.password = "SangatRahasia"

    println(user1.username)
    println(user1.password)

    println(user2.username)
    println(user2.password)
}