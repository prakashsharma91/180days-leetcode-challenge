package medium

class `260-SingleNumberIII` {
    fun singleNumber(nums: IntArray): IntArray {
        var xorAll = 0
        for(num in nums){
            xorAll = xorAll xor num
        }
        val setBit = xorAll and -xorAll

        var a = 0
        var b = 0
        for(num in nums){
            if ( setBit and num != 0)
                a = a xor num
            else
                b = b xor num
        }
        return intArrayOf(a, b)
    }
}