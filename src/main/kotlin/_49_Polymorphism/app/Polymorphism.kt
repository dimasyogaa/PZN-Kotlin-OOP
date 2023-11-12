package _49_Polymorphism.app

import _12_Function_Overriding.data.Employee
import _12_Function_Overriding.data.Manager
import _12_Function_Overriding.data.VicePresident

/**
 * Polymorphism berasal dari bahasa Yunani yang berarti banyak bentuk.
 * Dalam OOP, Polymorphism adalah kemampuan sebuah object berubah bentuk menjadi bentuk lain
 * Polymorphism erat hubungannya dengan Inheritance
 *
 */

fun main() {

    var employee: Employee = Employee("Dimas")
    employee.sayHello("Joko")

    // Berubah bentuk Dari Employee menjadi Manager
    employee = Manager("Dimas")
    employee.sayHello("Joko")

    // Berubah bentuk Dari Manager menjadi VicePresident
    employee = VicePresident("Dimas")
    employee.sayHello("Joko")

}