package _21_Abstract_class.app


import _21_Abstract_class.data.City
import _21_Abstract_class.data.Country

fun main() {

    // val location = Location("Subang") //error, tidak bisa dibuat instance-nya

    val city = City("Semarang")
    val country = Country("Indonesia")

    println(city.name)
    println(country.name)

}