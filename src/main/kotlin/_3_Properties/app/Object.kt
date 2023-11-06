package _3_Properties.app

import _3_Properties.data.Person


fun main() {
    val yoga = Person()
    yoga.firstName = "Yoga"
    // yoga.lastName = "Yoga" // val cannot reassign

    val dimas = Person()
    dimas.firstName = "Dimas"

    val pambudi = Person()
    pambudi.firstName = "Pambudi"

    println(yoga.firstName)
    println(dimas.firstName)
    println(pambudi.firstName)
}