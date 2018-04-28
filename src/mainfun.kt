package sample
class mainfun(){
    init {
        println(succ(31).toString())
        println(square(10).toString())
        for (i in 3..5 step 1){
            println(max(i,Math.abs(-i)))
        }
        println(sum(arrayOf(1,2,3,4,5,6,7,8,9,10)))

        var cnt = Counter(4)
        cnt.CountUp()
        println(cnt.getCount().toString())
    }
    fun succ(i :Int) = i+1
    fun square(i :Int) = i*i
    fun max(a: Int ,b:Int):String = if(a>b) b.toString() else if(a==b) "同じ"  else a.toString()
    fun sum(ints :Array<Int>):Int {
      var sum = 0
        for (i in ints){
            sum += i
        }
        return sum
    }

    /**
     * 可変長引数
     */
    fun sum(vararg ints:Int):Int{
        var sum :Int = 0
        for(i in ints ){
            sum += i
        }
        return sum
    }

// 名前付き引数
// 再帰呼び出し
// ローカル関数
}