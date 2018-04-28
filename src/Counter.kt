package sample

class Counter(i:Int){
    private var Count = i

    fun CountUp(): Unit{
        Count++
    }

    fun getCount():Int = Count
}
