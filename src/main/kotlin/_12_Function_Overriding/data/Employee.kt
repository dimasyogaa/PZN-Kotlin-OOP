package _12_Function_Overriding.data

open class Employee(val name: String) {

    open fun sayHello(name: String) {
        println("Hello $name, My Name is ${this.name}")
    }

}

class Manager(name: String) : Employee(name) {

    override fun sayHello(name: String) {
        println("Hello $name, My Name is Manager ${this.name}")
    }

}

class VicePresident(name: String) : Employee(name)  {

    override fun sayHello(name: String) {
        println("Hello $name, My Name is Vice President ${this.name}")
    }

}

/**
 * Saat kita membuat ulang function di class Child, secara standar,
 * function tersebut bersifat open, yang artinya bisa dibuat ulang di class Child dibawahnya lagi
 * Jika ingin membuat override function tidak bisa dibuat ulang oleh class Child dibawahnya lagi,
 * kita harus menggunakan kata kunci final
 *
 */

open class Manager2(name: String) : Employee(name) {

    final override fun sayHello(name: String) {
        println("Hello $name, My Name is Manager2 ${this.name}")
    }

}

class SuperManager(name: String) : Manager2(name) {

    // tidak bisa dioverride
    // override fun sayHello(name: String) {
    //     println("Hello $name, My Name is Manager ${this.name}")
    // }

}

