package _18_To_String_Function.data

class User(var username: String, var password: String) {

    override fun toString(): String {
        return "User with username=$username"
    }

}