
package sample

class Rational(val n: Int, val d: Int){
//イニシャライザ
    init{
    require(d!=0 ,{"denominator must not be null"})
}
//Math.abs,絶対値を返す
    private val g = gcd(Math.abs(n) ,Math.abs(d))
    val numberator: Int by lazy { n / g }
    val denominator: Int by lazy { d / g }
    operator fun plus(that: Rational):Rational =
            Rational(numberator * that.denominator + that.numberator * denominator,
                    denominator * that.denominator)
    operator fun plus(n:Int) :Rational =
            Rational(
                    numberator + n * denominator ,denominator
            )

    override fun toString(): String = "${numberator}/${denominator}"

    //末尾再帰
    tailrec private fun gcd(a: Int, b:Int): Int = if (b == 0 ) a else gcd(b,a%b)
}

operator fun Int.plus(r :Rational) : Rational = r + this


