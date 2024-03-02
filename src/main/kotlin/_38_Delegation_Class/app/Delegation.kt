package _38_Delegation_Class.app

import _38_Delegation_Class.data.MyBase
import _38_Delegation_Class.data.MyBaseDelegate
import _38_Delegation_Class.data.MyBaseDelegateAuto

fun main() {

    // basic
    val myBase = MyBase()
    myBase.sayHello("Yoga")

    println()

    // delegation manual - MyBaseDelegate(myBase) => pengirimDelegasi(PenerimaDelegasi)
    val baseDelegate = MyBaseDelegate(myBase)
    baseDelegate.sayHello("Dimas")
    baseDelegate.sayGoodBye("Dimas")

    println()

    // delegation auto
    val baseDelegateAuto = MyBaseDelegateAuto(myBase)
    baseDelegateAuto.sayHello("Pambudi")
    baseDelegateAuto.sayGoodBye("Pambudi")

}