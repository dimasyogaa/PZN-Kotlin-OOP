package _42_Operator_Overloading.data

/**
 * Kotlin mendukung operator overloading, artinya kita bisa membuat function dari operator-operator seperti operator matematika, dan lain-lain
 * Kemampuan ini membuat kita bisa melakukan operasi apapun di object seperti layaknya tipe data Integer
 * Ada banyak sekali operator yang bisa di override di Kotlin
 *
 * Untuk membuat operator overloading, kita bisa menggunakan kata kunci operator sebelum deklarasi function nya
 *
 */

data class Fruit(val quantity: Int) {

    operator fun plus(fruit: Fruit) : Fruit {
        return Fruit(this.quantity + fruit.quantity)
    }

    operator fun minus(fruit: Fruit) : Fruit {
        return Fruit(this.quantity - fruit.quantity)
    }

}