package _36_Type_Alias.data2

class Application(val name: String) {
    companion object {

        fun toUpper(value: String): String {
            return value.uppercase()
        }

    }
}