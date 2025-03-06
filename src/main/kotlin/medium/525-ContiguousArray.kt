package medium

class `525-ContiguousArray` {
    fun findMaxLength(nums: IntArray): Int {
        val minMap = HashMap<Int, Int>()
        minMap[0] = -1
        var count = 0
        var max = 0
        for(i in nums.indices){
            if ( nums[i] == 0 )
                count--
            else
                count++

            minMap[count] = Math.min(minMap.getOrDefault(count, Int.MAX_VALUE), i)

            max = Math.max(i - minMap[count]!!, max)
        }
        return max
    }
}

fun main() {
    `525-ContiguousArray`().findMaxLength(intArrayOf(0, 1, 1))
}