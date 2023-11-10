package _19_Equals_Function.app

import _19_Equals_Function.data.Company

fun main() {
    val company1 = Company("Dimas")
    val company2 = Company("Dimas")

    // println(company1 == company2) // jika tidak override equal, maka hasinya false

    println(company1 == company2)
}