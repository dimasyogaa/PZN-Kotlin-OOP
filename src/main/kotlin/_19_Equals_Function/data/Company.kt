package _19_Equals_Function.data

class Company(val name: String) {

    // memodifikasi cara memandingkan objek dengan override equals
    // agar fungsi equals mengecek propertiesnya bukan alamat objeknya
    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Company -> other.name == this.name
            else -> false
        }
    }
}