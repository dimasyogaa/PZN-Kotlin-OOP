// Package declaration (untuk struktur proyek)
package external._01_overloading_getter_setter

// Import Kotlin reflection class (untuk akses ke metadata class saat runtime)
import kotlin.reflect.KClass

// --------------------------------------------
// Base class untuk ViewModel (simulasi mirip Android)
// --------------------------------------------
open class ViewModel

// --------------------------------------------
// Simulasi ViewModelProvider (seperti di Android)
// Tujuannya adalah menyimpan dan menyediakan instance ViewModel
// --------------------------------------------
class ViewModelProvider {

    // Menyimpan ViewModel berdasarkan tipe KClass-nya
    private val viewModels = mutableMapOf<KClass<*>, ViewModel>()

    // Operator indexing agar bisa dipanggil dengan [SomeClass::class]
    operator fun <T : ViewModel> get(modelClass: KClass<T>): T {
        // Ambil instance dari map, kalau belum ada, buat baru dan simpan
        val viewModel = viewModels.getOrPut(modelClass) {
            // Ambil constructor pertama dan panggil untuk bikin instance
            modelClass.constructors.first().call()
        }
        // Karena map menyimpan ViewModel (tipe umum), perlu casting ke tipe spesifik
        @Suppress("UNCHECKED_CAST")
        return viewModel as T
    }
}

// --------------------------------------------
// Contoh ViewModel yang akan dikelola oleh ViewModelProvider
// --------------------------------------------
class MyViewModel : ViewModel() {
    var counter = 0 // Properti counter
    fun increment() {
        counter++ // Tambah 1 ke counter
    }
}

// --------------------------------------------
// Fungsi main untuk menjalankan simulasi
// --------------------------------------------
fun main() {
    // Buat instance dari ViewModelProvider
    val provider = ViewModelProvider()

    // Ambil instance MyViewModel dari provider (otomatis dibuat pertama kali)
    val myViewModel = provider[MyViewModel::class]

    // Tambah counter dua kali
    myViewModel.increment()
    myViewModel.increment()

    // Cetak nilai counter (harusnya 2)
    println("Counter: ${myViewModel.counter}")  // Output: Counter: 2

    // Ambil lagi ViewModel yang sama (harusnya tidak membuat ulang)
    val sameViewModel = provider[MyViewModel::class]

    // Cek apakah instance-nya sama (true jika tidak dibuat ulang)
    println("Is same instance: ${myViewModel === sameViewModel}") // true
}
