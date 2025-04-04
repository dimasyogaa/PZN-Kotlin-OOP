package external._02_reflection.simulation


// Semua "activity" akan turunan dari ini
abstract class SimulatableActivity : Injectable() {
    open fun onCreate() {}
}

// Contoh Activity A
class MainActivity : SimulatableActivity() {
    override fun onCreate() {
        println("MainActivity created")
        // Simulasi navigasi ke LoginActivity
        val intent = MiniIntent(MainActivity::class, LoginActivity::class)
        intent.start(AppContainer)
    }
}

// Contoh Activity B
class LoginActivity : SimulatableActivity() {
    override fun onCreate() {
        println("LoginActivity created")
    }
}
