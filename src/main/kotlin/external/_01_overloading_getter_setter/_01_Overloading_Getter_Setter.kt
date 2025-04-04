package external._01_overloading_getter_setter

class Box<T> {
    private val items = mutableMapOf<Int, T>()

    operator fun get(index: Int): T? {
        return items[index]
    }

    operator fun set(index: Int, value: T) {
        items[index] = value
    }
}


fun main() {
    val box = Box<String>()
    box[0] = "Hello"
    box[1] = "World"

    println(box[0]) // Output: Hello
    println(box[1]) // Output: World
}


/**
 * Kesimpulan:
 *
 *     [] di Kotlin adalah syntactic sugar untuk get() dan set().
 *
 *     Bisa kamu override sendiri dengan operator fun get(...) dan operator fun set(...).
 */