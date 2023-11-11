package _38_Delegation_Class.data


/**
 * Salah satu design pattern lain yang populer adalah Delegation
 * Delegation sederhananya adalah meneruskan properties atau function ke object yang lain
 * Kotlin mendukung delegation tanpa harus membuat kode secara manual
 *
 * Dalam delegation, properties dan function secara otomatis akan didelegasikan ke object yang dipilih
 * Namun kita tetap bisa meng-override properties dan function jika kita mau
 *
 * Konsep delegation otomatis adalah bahwa kita dapat meneruskan objek yang mengimplementasikan antarmuka, bukan tipe konkret tertentu -chat gpt
 */

// Basic
interface Base {
    fun sayHello(name: String)
    fun sayGoodBye(name: String)
}

// Delegation-nya - Penerima Delegasi
class MyBase : Base {
    override fun sayHello(name: String) {
        println("Hello $name")
    }
    override fun sayGoodBye(name: String) {
        println("GoodBye $name")
    }
}

// Delegation Manual - Pengirim Delegasi
class MyBaseDelegate(val base: Base) : Base {
    override fun sayHello(name: String) {
        base.sayHello(name)
    }
    override fun sayGoodBye(name: String) {
        base.sayGoodBye(name)
    }
}

// Delegation Otomatis - delegation-nya yaitu by iniBase
// tidak wajib override semua function untuk mendelegasikan
class MyBaseDelegateAuto(val iniBase: Base) : Base by iniBase {

    // ini tidak didelegasikan
    override fun sayHello(name: String) {
        println("Hi $name")
    }
}
