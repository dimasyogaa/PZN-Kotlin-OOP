package _13_Properties_Overriding.app

import _13_Properties_Overriding.data.Rectangle
import _13_Properties_Overriding.data.Shape
import _13_Properties_Overriding.data.Triangle

fun main() {
    val shape = Shape()
    println(shape.corner)

    val shape2 = Rectangle()
    println(shape2.corner)

    val shape3 = Triangle()
    println(shape3.corner)

}