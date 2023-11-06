package _4_Constructors.app

import _4_Constructors.data.Person


fun main() {
    val yoga = Person(
        "Yoga",
        "Dimas",
        "Pambudi"
    )

    println(yoga.firstName)
    println(yoga.middleName)
    println(yoga.lastName)

}