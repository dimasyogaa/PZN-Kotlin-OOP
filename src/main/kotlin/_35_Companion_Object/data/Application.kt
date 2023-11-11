package _35_Companion_Object.data

/**
 * Companion object adalah kemampuan membuat inner object di dalam class, tanpa harus menggunakan nama object
 * Companion object secara otomatis akan menggunakan nama Companion, atau bisa langsung diakses lewat nama class nya
 *
 */

class Application(val name: String) {
    companion object {

        fun toUpper(value: String): String {
            return value.uppercase()
        }

    }
}
