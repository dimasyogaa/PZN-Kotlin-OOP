package _15_Super_Constructor.data

open class Customer(val name: String, val type:String, val balance: Long) {

    constructor(name: String, type: String) : this(name, type, 0)

    constructor(name: String) : this(name, "Standard")

}

class PremiumCustomer : Customer {

    //bisa menggunakan kata kunci super
    constructor(name: String) : super(name, "Premium")

    constructor(name: String, balance: Long) : super(name,"Premium", balance)

}

// bisa juga langsung dari primary constructor inheritance-nya
class ExecutiveCustomer(name: String, balance: Long): Customer(name, "Executive", balance) {
    constructor(name: String) : this(name,0)
}

/**
 * ketika mendeklarasikan primary constructor pada child class,
 * maka tidak bisa melakukan super constructor pada child class tersebut,
 * karena secondary constructor akan memprioritaskan primary constructor pada child class tersebut
 * dan
 * primary constructor tidak dideklarasikan pada parent class ketika proses inheritance pada child class ketika
 * secondary constructor pada child class tersebut ingin mengakses constructor parent class
 *
 */