package _24_Late_Initialized_Properties.app

import _24_Late_Initialized_Properties.data.Television

fun main() {

    val tv = Television()
    // println(tv.brand) // error UninitializedPropertyAccessException

    // sebelum diakses brand-nya, harus di set dulu brand-nya
    // // cara 1
    // tv.brand = "Samsung"

    // cara 2
    tv.initTelevision("Samsung")
    println(tv.brand)

}