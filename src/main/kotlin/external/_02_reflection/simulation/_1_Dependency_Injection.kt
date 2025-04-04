package external._02_reflection.simulation

import kotlin.reflect.KClass
import kotlin.reflect.full.createInstance

// Base class buat semua yang bisa di-inject
open class Injectable

// Mini DI Container
class MiniDIContainer {

    // Menyimpan instance yang sudah dibuat
    private val instances = mutableMapOf<KClass<*>, Any>()

    // Register instance manual (optional)
    fun <T : Any> register(clazz: KClass<T>, instance: T) {
        instances[clazz] = instance
    }

    // Ambil instance, buat jika belum ada
    fun <T : Any> get(clazz: KClass<T>): T {
        val instance = instances.getOrPut(clazz) {
            clazz.createInstance() // Bikin instance baru dari primary constructor tanpa argumen
        }
        @Suppress("UNCHECKED_CAST")
        return instance as T
    }
}
