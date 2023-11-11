package _42_Operator_Overloading.app

import _42_Operator_Overloading.data.Fruit

fun main() {

    val fruit1 = Fruit(100)
    val fruit2 = Fruit(100)
    val fruit3 = fruit1 + fruit2 //otomatis menjalankan overloading function operator plus

    println(fruit3)
    println(fruit3 - Fruit(10)) //otomatis menjalankan overloading function operator minus

}