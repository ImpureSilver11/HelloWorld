
package sample

class Rational(val n: Int, val d: Int){
init{
    require(d!=0 ,{"denominator must not be null"})
}
    private val g = gcd(Math.abs(n) ,Math.abs(d))
    val numberator: Int by lazy { n / g }
    val denominator: Int by lazy { d / g }
    operator fun plus(that: Rational):Rational =
            Rational(numberator * that.denominator + that.numberator * denominator,
                    denominator * that.denominator)

    override fun toString(): String = "${numberator}/${denominator}"

    //末尾再帰
    tailrec private fun gcd(a: Int, b:Int): Int = if (b == 0 ) a else gcd(b,a%b)
}


fun main(args: Array<String>){
//val harl = Rational(17, 17)
//    println(harl)
    println(Rational(55,100))
    println(Rational(n = 1234, d = 5678))
//    println("hello world")
    println(Rational(1,4).plus(Rational(1,2)))
    println(Rational(1,3).plus(Rational(4,7)))
    println(Rational(1,6)+ Rational(1,3)+ Rational(1,2) )
}
