package easy

class `191-Numberof1Bits` {
    fun hammingWeight(n: Int): Int {
        return Integer.bitCount(n)
    }

    fun hammingWeight2(n: Int): Int {
        var count = 0
        var i = 0
        var num = n
        while(i < 32){
            if ( (num and 1) == 1){
                count++
            }
            num = num ushr 1
            i++
        }
        return count
    }
}