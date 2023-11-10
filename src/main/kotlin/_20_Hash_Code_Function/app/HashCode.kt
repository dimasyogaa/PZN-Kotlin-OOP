package _20_Hash_Code_Function.app

import _20_Hash_Code_Function.data.Company
import _19_Equals_Function.data.Company as CompanyWithoutHashCodeOverride

fun main() {

    val company1 = CompanyWithoutHashCodeOverride("Dimas")
    val company2 = CompanyWithoutHashCodeOverride("Dimas")

    // println(company1.hashCode() == company2.hashCode()) // jika tidak override hascode, maka hasinya false

    val company3 = Company("Dimas")
    val company4 = Company("Dimas")
    println(company3.hashCode() == company4.hashCode()) //true

    // to string : representasi string dari objek yang kita buat
    // hash code : representasi integer dari objek yang kita buat



}