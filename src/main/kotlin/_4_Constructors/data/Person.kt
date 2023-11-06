package _4_Constructors.data

class Person(
    firstNameParam: String,
    middleNameParam: String?,
    lastNameParam: String
) {
    var firstName: String = firstNameParam
    var middleName: String? = middleNameParam
    val lastName: String = lastNameParam
}