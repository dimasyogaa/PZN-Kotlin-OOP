package _15_Super_Constructor.app

import _15_Super_Constructor.data.ExecutiveCustomer
import _15_Super_Constructor.data.PremiumCustomer

fun main() {
    val premiumCustomer = PremiumCustomer("Yoga")
    println(premiumCustomer.name)

    val executiveCustomer = ExecutiveCustomer("Dimas", 1_000_000_000)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)
}