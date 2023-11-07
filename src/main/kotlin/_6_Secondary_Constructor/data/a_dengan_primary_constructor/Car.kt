package _6_Secondary_Constructor.data.a_dengan_primary_constructor

class Car(
    paramBrand: String,
    paramName: String,
    paramYear: Int
) {

    init {
        println("Car $paramBrand dibuat")
    }

    constructor(paramBrand: String, paramName: String) : this(paramBrand, paramName, 2020) {
        println("Secondary Constructor 1")
    }

    // constructor ini memanggil secondary contructor 1 diatas
    constructor(paramBrand: String) : this(paramBrand,"" ) {
        println("Secondary Constructor 2")
    }

    var brand: String = paramBrand
    var name: String = paramName
    var year: Int = paramYear
}