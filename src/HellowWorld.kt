
package sample

class Rational(val numberator: Int, val denominator: Int){
init{
    require(denominator !=0 ,{"denominator must not be null"})
}
    override fun toString(): String = "${numberator}/${denominator}"
}


fun main(args: Array<String>){
val harl = Rational(2, 0)


    println(harl)


    println("hello world")
}
