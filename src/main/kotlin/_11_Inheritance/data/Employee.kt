package _11_Inheritance.data

open class Employee(val name: String) {

    fun sayHello(name: String) {
        println("Hello $name, My Name is ${this.name}")
    }

}

class Manager(name: String) : Employee(name)

class VicePresident(name: String) : Employee(name)