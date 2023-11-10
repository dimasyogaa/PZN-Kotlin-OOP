package _22_Abstract_Properties_Function.data

/**
 * properties dan method abstract harus :
 * - dideklarasikan di dalam class abstract
 * - harus dioverride di kelas turunannya/child class
 * - tidak boleh ada body pada function dan value pada propertiesnya,jadi hanya nama saja
 */
abstract class Animal {
    abstract val name: String
    abstract fun run()
}

class Cat : Animal() {
    override val name: String = "Cat"

    override fun run() {
        println("Cat run")
    }

}

class Dog : Animal() {
    override val name: String = "Dog"
    override fun run() {
        println("Dog run")
    }
}