
package sample

class Rational(val n: Int, val d: Int){
init{
    require(d!=0 ,{"denominator must not be null"})
}
    override fun toString(): String = "${numberator}/${denominator}"
private val g = gcd(Math.abs(n) ,Math.abs(d))
    val numberator: Int = n / g
    val denominator: Int = d / g
tailrec private fun gcd(a: Int, b:Int): Int =
        if (b == 0 )a
    else gcd(b,a%b)
}


fun main(args: Array<String>){
val harl = Rational(17, 17)
    println(harl) 
    println(Rational(55,100))
    println(Rational(1234,5678))
//    println("hello world")
}
