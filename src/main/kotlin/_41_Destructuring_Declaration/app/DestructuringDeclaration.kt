package _41_Destructuring_Declaration.app

import _41_Destructuring_Declaration.data.Game
import _41_Destructuring_Declaration.data.GameNotDataClass
import _41_Destructuring_Declaration.data.Login
import _41_Destructuring_Declaration.data.MinMax

/** 1
 * Destructuring declaration adalah membuat multiple variables dari sebuah object
 * Destructuring tidak bisa dilakukan untuk semua object,  hanya objek yang memiliki function componentX() yang bisa dilakukan destructuring
 * Saat kita membuat data class, secara otomatis akan dibuatkan function componentX() sesuai dengan jumlah parameter nya
 *
 */

/** 2 destructuring function
 * Destructuring declarations juga bisa dilakukan ketika memanggil function
 * Dengan ini, seakan-akan kita bisa mengembalikan multiple return value pada function
 *
 */
fun minMax(value1: Int, value2: Int): MinMax {
    return when {
        value1 > value2 -> MinMax(value2, value1)
        else -> MinMax(value1, value2)
    }
}

/** 4
 * Destructuring juga bisa dilakukan di lambda parameter
 * Hal ini bisa mempermudah kita saat ingin mengakses data yang ada di parameter
 *
 */
typealias LoginCallback = (Login) -> Boolean

fun loginFunc(login: Login, callback: LoginCallback): Boolean {
    return callback(login)
}

fun main() {

    // not data class
    val game1 = GameNotDataClass("Game Kotlin", 1000)
    val name11 = game1.name
    val price12 = game1.price
    // bisa disingkat - jangan lupa tambahkan keyword operator supaya bisa destructuring
    val (name13, price14) = game1
    println(name13)
    println(price14)

    println()

    // with data class - lebih efektif
    val game2 = Game("Game Kotlin Data Class", 5000)
    val (name, price) = game2
    println(name)
    println(price)

    println()

    // destructuring function
    val result = minMax(10, 100)
    val min11 = result.min
    val max12 = result.max
    // bisa dipersingkat
    val (min, max) = minMax(10, 100)
    println(min)
    println(max)

    println()

    /** 3
     * Kadang kita hanya ingin melakukan destructuring pada beberapa variable, dan menghiraukan variable lainnya
     * Untuk menghiraukan suatu variable, kita bisa menggunakan kata kunci  _ (underscore)
     *
     */
    val (min2, _) = minMax(10, 100)
    println(min2)

    println()

    // 4 destructuring di lambda
    val yogalogin = Login("Yoga", "Rahasia")
    loginFunc(yogalogin) { dataLogin ->
        dataLogin.username == "Yoga" && dataLogin.password == "Rahasia"
    }
    // bisa dipersingkat
    loginFunc(yogalogin) { (username, password) ->
        username == "Yoga" && password == "Rahasia"
    }


}