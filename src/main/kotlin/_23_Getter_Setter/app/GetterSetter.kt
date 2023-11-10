package _23_Getter_Setter.app

import _23_Getter_Setter.data.BigNote
import _23_Getter_Setter.data.Note

fun main() {
    val note = Note("Belajar Kotlin")

    println(note.title) // otomatis memanggil getter-nya

    note.title = "" // otomatis memanggil setter-nya

    println(note.title)

    println()

    val bigNote = BigNote("Belajar Kotlin")
    println(bigNote.title)
    println(bigNote.bigTitle)
}