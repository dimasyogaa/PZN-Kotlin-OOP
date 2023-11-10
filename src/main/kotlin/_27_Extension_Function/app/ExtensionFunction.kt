package _27_Extension_Function.app

import _27_Extension_Function.data.Student
import _27_Extension_Function.data.sayHello
import _27_Extension_Function.data.sayHelloNullable


fun main() {

    val student = Student("Dimas", 21)
    student.sayHello("Pratama")
    student.sayHelloNullable("Pambudi")

}