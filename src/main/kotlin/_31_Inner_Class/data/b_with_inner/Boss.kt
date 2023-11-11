package _31_Inner_Class.data.b_with_inner

class Boss (val bossName: String) {

    // karena keyword inner
    inner class Employee(val name: String) {

        // bisa akses data outer class
        fun hi() {
            println("Hi, my name is $name, and my boss name is $bossName")
        }

        fun hi2() {
            println("Hi, my name is $name, and my boss name is ${this@Boss.bossName}")
        }

    }

}