package _7_Properties_di_Constructor.data

/* // Pendahuluan
class User(usernameParam: String, passwordParam: String) {

    // properties
    var username:String = usernameParam
    var password:String = passwordParam
 } */


/**
 * Kotlin mendukung deklarasi properties langsung di primary constructor
 * Ini sangat berguna untuk mempersingkat saat kita ingin membuat properties, dan mengisi datanya lewat constructor
 *
 */

// hanya bisa dilakukan di primary constructor, tidak bisa di secondary constructor
class User(var username: String, var password: String) {

}