package _47_Reflection_Class.app

import _44_Exception.data.ValidationException
import _47_Reflection_Class.data.CreateCategoryRequest
import _47_Reflection_Class.data.CreateProductRequest
import _47_Reflection_Class.data.annotation.NotBlank
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties

// basic - pendahuluan
fun validateRequestNotEffective(request: CreateProductRequest) {
    if (request.id == "") {
        throw ValidationException("id is blank")
    } else if (request.name == "") {
        throw ValidationException("name is blank")
    }
}

fun validateRequestNotEffective(request: CreateCategoryRequest) {
    if (request.id == "") {
        throw ValidationException("id is blank")
    } else if (request.name == "") {
        throw ValidationException("name is blank")
    }
}

/**
 * Reflection adalah kemampuan melihat struktur aplikasi kita pada saat berjalan
 * Reflection biasanya sangat berguna saat kita ingin membuat library ataupun framework, sehingga bisa meng-otomatisasi pekerjaan
 * Untuk mengakses reflection class dari sebuah object, kita bisa menggunakan kata kunci ::class, atau bisa langsung dari NamaClass::class
 *
 */

/** lebih efektif gunakan reflection
 * 1. membuat kelas annotation : NotBlank
 * 2. meletakan annotation @NotBlank pada properties di data class
 * 3. membuat fungsi validateRequest dengan tipe parameter Any
 *
 * Note : jangan lupa import library kotlin-reflection
 * */
fun validateRequest(request: Any) {
    val clazz = request::class // reflection

    val properties = clazz.memberProperties

    // iterate satu satu, lalu cek kalo ada annotation @NotBlank
    for (property in properties) {

        if (property.findAnnotation<NotBlank>() != null) {

            val value = property.call(request)

            when (value) {
                is String -> {
                    if ("" == value) {
                        throw ValidationException("${property.name} is blank")
                    }
                }
            }

        }
    }
}

fun main() {
    val request = CreateProductRequest("1", "Indomie", 2000)
    validateRequest(request)

    val request2 = CreateCategoryRequest("1", "Food")
    validateRequest(request2)
}