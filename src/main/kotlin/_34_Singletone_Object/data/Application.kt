package _34_Singletone_Object.data

/** 2
 * Di Kotlin, singleton object bisa dibuat di dalam sebuah class
 * Namun berbeda dengan inner class, singleton object tidak bisa mengakses properties atau function yang ada di outer class nya
 *
 */

class Application(val name: String) {
    object Utilities {

        fun toUpper(value: String): String {
            return value.uppercase()
        }

    }
}

class Application2(val name: String) {
    object Application2 {

        fun toUpper(value: String): String {
            return value.uppercase()
        }

    }
}