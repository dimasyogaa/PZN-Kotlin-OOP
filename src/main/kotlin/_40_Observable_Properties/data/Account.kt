package _40_Observable_Properties.data


import kotlin.properties.Delegates

class Account(description: String = "") {
    val name: String by lazy {
        println("Name is called")
        "Dimas"
    }

    /**
     * Salah satu standar library yang disediakan oleh Kotlin untuk delegating di properties adalah observable properties
     * Dengan observable properties, kita bisa tahu properties, value sebelum dan value setelah ketika diubah
     *
     */

    var description: String by Delegates.observable(description) {property, oldValue, newValue ->
        println("${property.name} is changed from $oldValue to $newValue")
    }
}