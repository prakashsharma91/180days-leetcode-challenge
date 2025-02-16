package easy

class `338-CountingBits` {
    fun countBits(n: Int): IntArray {
        val list = mutableListOf<Int>()
        for(i in 0 until  n+1){
            list.add(Integer.bitCount(i))
        }
        return list.toIntArray()
    }
}