package _5_Initializer_Block.data

class Car(
    paramBrand: String,
    paramYear: Int = 2020
) {

    // blok kode yang akan dieksekusi ketika constuctor dipanggil
    init {
        println("Car $paramBrand dibuat")
    }

    var brand: String = paramBrand
    var year: Int = paramYear
}