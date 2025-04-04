package external._02_reflection

import kotlin.reflect.full.functions
import kotlin.reflect.full.memberProperties

// Contoh class
class Person(val name: String, val age: Int) {
    fun greet() {
        println("Hi, my name is $name and I’m $age years old.")
    }
}

// Main
fun main() {
    val personClass = Person::class

    // 🔍 Lihat nama class
    println("Class name: ${personClass.simpleName}")

    // 🔍 Ambil constructor dan buat instance
    val constructor = personClass.constructors.first()
    val person = constructor.call("Alice", 30)

    // 🔍 Akses properti
    val properties = personClass.memberProperties
    for (prop in properties) {
        println("Property: ${prop.name} = ${prop.get(person)}")
    }

    // 🔍 Panggil fungsi
    val greetFunction = personClass.functions.find { it.name == "greet" }
    greetFunction?.call(person)
}


/**
 *
 *
 * 🧠 Apa Itu Reflection?
 *
 * Reflection adalah kemampuan program untuk:
 *
 *     melihat struktur dirinya sendiri saat runtime (class, property, method, dll),
 *
 *     dan memanipulasinya (bikin instance, ambil nilai properti, panggil fungsi, dst.).
 *
 * Kotlin menyediakan reflection lewat package kotlin.reflect (KClass, KFunction, dll).
 *
 */
