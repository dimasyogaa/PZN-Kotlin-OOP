package external._02_reflection.simulation

// Global container (sebagai pengganti Application)
val AppContainer = MiniDIContainer()

fun main() {
    // Simulasi app start
    val main = AppContainer.get(MainActivity::class)
    main.onCreate()
}
