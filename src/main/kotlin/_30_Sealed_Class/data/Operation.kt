package _30_Sealed_Class.data

/**
 * Sealed class merupakan jenis class yang didesain untuk inheritance
 * Sealed class tidak bisa diinstansiasi menjadi object, dan secara standar sealed class merupakan abstract class
 * Sealed class sangat cocok digunakan sebagai class Parent
 */

sealed class Operation(val name:String)

class Plus : Operation("Plus")
class Minus : Operation("Minus")
class Modulo : Operation("Modulo")