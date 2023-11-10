package _27_Extension_Function.data

/**
 * Extension Function, yaitu menambahkan function pada tipe data yang sudah ada
 *
 * Perlu diperhatikan,
 * bahwa saat membuat extension function, kita tidak memodifikasi class aslinya
 * Extension function hanyalah sebuah function bantuan yang artinya,
 * kita tidak bisa mengakses data private atau protected dari class tersebut
 *
 */

class Student(val name: String, val age: Int)

fun Student.sayHello(name: String) {
    println("Hello $name, my name is ${this.name}, and my age is ${this.age}")
}

class Student2(val name: String, private val age: Int)

fun Student2.sayHello(name: String) {
    // println("Hello $name, my name is ${this.name}, and my age is ${this.age}") // error
}

/**
 * Nullable Extension Function
 */
fun Student?.sayHelloNullable(name: String) {
    if (this != null) {
        println("Hello $name, my name is ${this.name}, and my age is ${this.age}")
    }
}