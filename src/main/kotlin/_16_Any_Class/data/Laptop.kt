package _16_Any_Class.data
/** apapun membuat class, superclassnya Any */

class Laptop(val name: String) // -> class Laptop class Laptop(val name: String) : Any()

open class HandPhone(val name: String)

class SmartPhone(name: String, val os: String) : HandPhone(name)

