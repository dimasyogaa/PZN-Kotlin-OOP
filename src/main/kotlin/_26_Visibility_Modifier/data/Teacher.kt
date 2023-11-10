package _26_Visibility_Modifier.data

open class Teacher(val name: String) {

    private fun teach() {
        println("Teach!")
    }

    protected open fun test() {
        println("Test")
    }

}

class SuperTeacher(name: String) : Teacher(name) {

     override fun test() {
        super.test()
    }
}