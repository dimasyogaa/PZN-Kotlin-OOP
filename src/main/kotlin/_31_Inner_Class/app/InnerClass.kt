package _31_Inner_Class.app

import _31_Inner_Class.data.b_with_inner.Boss
import _31_Inner_Class.data.a_without_inner.Boss as BossWithoutInner

fun main() {

    val boss1 = BossWithoutInner.Employee("Dimas")
    println(boss1.hi())

    println()

    val bossPambudi = Boss("Pambudi")
    val joko = bossPambudi.Employee("Joko")
    val nugroho = bossPambudi.Employee("Nugroho")

    joko.hi()
    nugroho.hi2()

    println()

    val bossYoga = Boss("Yoga")
    val rizal = bossYoga.Employee("Rizal")
    val afri = bossYoga.Employee("Afri")

    rizal.hi()
    afri.hi2()

}