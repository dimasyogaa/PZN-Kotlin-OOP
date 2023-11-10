package _23_Getter_Setter.data

/**
 * Getter adalah function yang dibuat untuk mengambil data properties
 * Setter ada function untuk mengubah data properties
 * Di kotlin, kita tidak perlu manual untuk membuat function Getter dan Setter nya,
 * karena sudah difasilitasi sehingga lebih mudah
 *
 * jika var, kita bisa get dan set. tapi
 * jika val, kita hanya bisa get.
 *
 * field -> reference ke nama variabel yang digunakan untuk GET
 * value -> reference ke nilai yang akan di SET ke nama variabel
 *
 * getter dan setter tidak wajib dideklarasikan semua di kotlin
 */

class Note(title: String) {

    // basic
    // var title: String = title
    //     get() = field // field ==> title
    //     set(value) {
    //         field = value // value ==> nilai yang akan di assign/set ke title(field)
    //     }

    //validation
    var title: String = title
        get() {
            println("Call getter function")
            return field
        }
        set(value) {
            println("Call Setter")
            if (value.isNotBlank()) {
                field = value
            } else {
                println("Invalid title")
            }
        }


}

class BigNote (val title: String) {

    val bigTitle: String
        get() = title.uppercase()

}