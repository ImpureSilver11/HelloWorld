package sample

/**
 * オブジェクト
 * リテラル
 * 文法など
 */
class BasicGrammar(val str: String) {
    init {
//        this.outpur(str)
//        this.criateAry()
        this.ConditionalBranch()
    }

    var a: String = ""
    fun outpur(str: String) {
//リテラル
        println("Hallow $str!")
        a = """
            |It's
            |sunny
            |today.
        """.trimMargin()
        println(a)
    }

    //    配列とか
    fun criateAry() {
        val ints = arrayOfNulls<Int>(5)
        println(ints.size)
        println(ints[0])
        ints[0] = 123
        println(ints[0])
        val strs = arrayOf("Red", "green", "blue")
        println(strs[0])
        val intary: IntArray = intArrayOf(1, 2, 3)
        val chars: CharArray = charArrayOf('a', 'b', 'c')
        println("${intary[0]} , ${chars[0]}")
//       Setは重複を削除する
        val set: Set<Int> = setOf(1, 2, 3, 1, 1, 2, 2, 2, 12)
        println(set)
        val sets: Set<String> = setOf("a", "b", "c", "c", "b", "a")
        println(sets)
//        MAP
        val numberMap: MutableMap<String, Int> = mutableMapOf("one" to 1, "two" to 2)
        println((numberMap))
        numberMap += "There" to 3
//        レンジ
        val Range: IntRange = 1..10
        println(Range)
        println(5 in Range)
        println(5 !in Range)
        val Rangelist = Range.toList()
        println(Rangelist)
//        println((5 .. 1).reversed().toList())
        println((5 downTo 1).toList())
    }

    fun ConditionalBranch() {
//        IF
        for (score in 40..70 step 10) {
            val message = if (score >= 60) "合格" else if (score < 60 && score >= 50) "ぎり合格" else "不合格"
            print(" ${message},")
        }
        println()
        for(i in 1..10 step 1){
            val whee = when(i){
                1-> "one"
                2,3 -> "two or there"
//                whenは条件に関数やレンジの設定が可能
                in 5..7 -> "five to seven"
                else -> {
                    "unknown"
                }
            }
            print(" ${whee},")
        }
    }
}

