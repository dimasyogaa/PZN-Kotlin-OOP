package external._02_reflection.simulation

import kotlin.reflect.KClass

class MiniIntent(
    val from: KClass<*>,
    val to: KClass<*>
) {
    fun start(context: MiniDIContainer) {
        println("Navigating from ${from.simpleName} to ${to.simpleName}")
        val target = context.get(to)
        if (target is SimulatableActivity) {
            target.onCreate()
        }
    }
}
