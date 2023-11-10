package _21_Abstract_class.data

/**
 * tidak perlu menambahkan open
 * karena secara default kelas abstract itu open
 */
abstract class Location (val name: String)

class City(name: String) : Location(name)

class Country(name: String) : Location(name)
