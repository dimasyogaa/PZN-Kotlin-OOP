package _38_Delegation.app

import _38_Delegation.data.MyBase
import _38_Delegation.data.MyBaseDelegate

fun main() {

    // basic
    val myBase = MyBase()
    myBase.sayHello("Yoga")

    println()

    // delegation manual
    val baseDelegate = MyBaseDelegate(myBase)
    baseDelegate.sayHello("Dimas")
    baseDelegate.sayGoodBye("Dimas")

    println()

    // delegation auto
    val baseDelegateAuto = MyBaseDelegate(myBase)
    baseDelegateAuto.sayHello("Pambudi")
    baseDelegateAuto.sayGoodBye("Pambudi")

}