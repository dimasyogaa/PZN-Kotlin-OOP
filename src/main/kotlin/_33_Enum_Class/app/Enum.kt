package _33_Enum_Class.app

import _33_Enum_Class.data.Gender

fun main() {

    val man = Gender.MALE
    val woman = Gender.FEMALE

    val allGenders: Array<Gender> = Gender.values()

    val manFromString = Gender.valueOf("MALE")
    val womanFromString = Gender.valueOf("FEMALE")

    println(man)
    println(woman)
    println(allGenders.toList())
    println(manFromString)
    println(womanFromString)

    println()

    println(man.showDescription())
    println(woman.showDescription())

}