package _43_Null_Safety.app


import _43_Null_Safety.data.Friend

/** cara 1 */
fun checkingForNull() {
    fun sayHello(friend: Friend?) {
        if (friend !== null) {
            //jika sudah ada pengecekan null, maka tidak perlu menambahkan ? (tanda tanya)
            println("Hello ${friend.name}")
        }
    }
    sayHello(Friend("Dimas"))
    sayHello(null) // Tidak Keluar Output
    println()
}

/** cara 2 */
fun safeCall() {
    fun sayHello(friend: Friend?) {
            //jika tidak ada pengecekan null, maka perlu menambahkan ? safe call
            println("Hello ${friend?.name}")
    }
    sayHello(Friend("Dimas"))
    sayHello(null) // Hello Null
    println()
}

/** cara 3*/
fun elvisOperator() {
    fun sayHello(friend: Friend?) {
        // jika tidak ada pengecekan null, maka perlu menambahkan ? safe call,
        // lalu beri ?: nilai default
        println("Hello ${friend?.name ?: "Friend"}")
    }
    sayHello(Friend("Dimas"))
    sayHello(null) // Hello Friend
    println()
}

/** Tidak Direkomendasikan -- Harus Dipastikan Tidak Null*/
fun forceBelieveNotNull() {
    fun sayHello(friend: Friend?) {
        // !! operator : memaksa dan menyakinkan bahwa data yang diterima tidak mungkin null
        println("Hello ${friend!!.name}")
    }
    sayHello(Friend("Dimas"))
    // sayHello(null) // Error Exception : java.lang.NullPointerException
    println()
}

fun main() {

    checkingForNull()

    safeCall()

    elvisOperator()

    forceBelieveNotNull() // sangat tidak direkomendasikan


}

//direkomendasikan gabungan antara checking for null dengan elvisoperator