package easy

class `190-ReverseBits` {
    // you need treat n as an unsigned value
    fun reverseBits(n:Int):Int {
        var result = 0
        for(i in 0..31){
            result = result shl 1 or (n shr i and 1)
        }
        return result
    }
}