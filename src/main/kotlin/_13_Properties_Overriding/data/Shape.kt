package _13_Properties_Overriding.data

open class Shape{

    open val corner: Int = -1

}

class Rectangle : Shape() {
    override val corner: Int = 4
}

class Triangle : Shape() {
    override val corner: Int = 3
}


//---------------------------------------------------------------------------
open class Rectangle2 : Shape() {
    final override val corner: Int = 4
}

class Triangle2 : Rectangle2() {
    // override val corner: Int = 3 // error tidak bisa dioverride
}

// konsepnya sama seperti function overriding