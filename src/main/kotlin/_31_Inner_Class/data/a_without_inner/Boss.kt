package _31_Inner_Class.data.a_without_inner

class Boss (val bossName: String) {

    class Employee(val name: String) {

        fun hi() {
            println("Hi, my name is $name, and my boss name is $name")
        }

        // tidak bisa akses data outer class
        fun hi2() {
            // println("Hi, my name is $name, and my boss name is $bossName")
        }

    }

}