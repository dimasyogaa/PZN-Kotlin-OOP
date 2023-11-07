package _6_Secondary_Constructor.data.b_tanpa_primary_constructor

class Address {
    var street: String = ""
    var city: String = ""
    var country: String = "Indonesia"

    constructor(paramStreet: String, paramCity: String) {
        street = paramStreet
        city = paramCity
    }

    constructor(
        paramStreet: String,
        paramCity: String,
        paramCountry: String) : this(paramStreet, paramCity) {
        country = paramCountry
    }
}