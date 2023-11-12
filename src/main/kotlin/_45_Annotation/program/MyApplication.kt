package _45_Annotation.program

import _45_Annotation.data.Fancy

/** 2 */
@Fancy(author = "Dimas")
class MyApplication(val name: String, val version: Int) {

    fun info(): String = "Application $name-$version"
}