package _10_This_Keyword.data

class Person {
    var firstName: String = ""
    var middleName: String? = null
    var lastName: String = ""

    fun sayHello(name: String) {
        println("Hello $name, My Name is ${this.firstName}")
    }

    fun sayHello(firstName: String, lastName: String) {
        println("Hello $firstName $lastName, My Name is ${this.firstName}")
    }

    fun run(){
        println("I'm Run")
    }

    fun getFullName(): String {
        return "${this.firstName} ${this.middleName} ${this.lastName}"
    }
}