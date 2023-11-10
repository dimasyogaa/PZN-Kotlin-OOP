package _25_Interface.data

/**
 * Di kotlin, deklarasi type tidak hanya dalam bentuk class, ada juga interface
 * Interface adalah blueprint, prototype atau cetakan di Kotlin
 * Berbeda dengan Class, Interface tidak bisa langsung dibuat sebagai Object
 * Interface hanya bisa diturunkan, dan biasanya Interface digunakan sebagai kontrak untuk class - class turunannya
 * Secara standar, semua properties dan function di Interface adalah abstract
 *
 * sama seperti abstract bedanya
 * interface ketika diimplemntasi pada sebuah class tidak perlu menggunakan tanda ()
 * secara default,properties dan function di interface sudah abstract dan open
 * sehingga tidak perlu keyword abstract
 *
 *
 * CONCRETE FUNCTION
 * jika di abstract tidak boleh membuat body pada function
 * namun, di interface boleh membuat body
 *
 * Function di Interface memiliki pengecualian, tidak harus abstract
 * Kita bisa membuat concrete function di Interface, artinya function tersebut tidak wajib untuk dibuat ulang di child Class nya
 *
 *
 * Inheritance di Class hanya boleh memiliki satu class Parent
 * Di Interface, sebuah class Child bisa memiliki banyak interface Parent
 *
 */

interface Interaction {

    val name: String

    fun sayHello(name: String)

    // tidak wajib di override --> concrete function
    fun sayHelloConcrete(name: String) {
        println("Concrete : Hello $name, my name is ${this.name}")
    }

}

interface Go {
    fun go() {
        println("Go")
    }
}


open class Contoh

class Human(override val name: String ) : Contoh(), Interaction, Go {

    override fun sayHello(name: String) {
       println("Hello $name, my name is ${this.name}")
    }

}


/**
 *  * Tidak hanya Class yang punya kemampuan Inheritance
 *  * Interface juga bisa melakukan Inheritance dengan Interface lain
 *  * Namun Interface tidak bisa melakukan Inheritance dengan Class
 *  * singkatnya hanya boleh memiliki super interface bukan super class
 */

interface Go2 : Interaction {
    fun go() {
        println("Go2")
    }
}

class Human2(override val name: String ) : Go2 {

    override fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }

}

/**
 * Konflik Di Interface
 */

interface MoveA {
    fun move() = println("Move A")
}

interface MoveB {
    fun move() = println("Move B")
}

class Human3(override val name: String ) : Go2, MoveA, MoveB {

    override fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }

    // Error Konflik
    // override fun move() {
    //     TODO("Not yet implemented")
    // }
    //
    // override fun move() {
    //     TODO("Not yet implemented")
    // }

    /** Memperbaiki Konflik */
    override fun move() {
        super<MoveA>.move() // Move A
        super<MoveB>.move() // Move B
        println("Move Human")
    }

}
