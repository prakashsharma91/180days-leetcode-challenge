package medium


class `560-SubarraySum EqualsK` {
}

class Solution560 {
    fun subarraySum(nums: IntArray, k: Int): Int {
        val sumToCount: MutableMap<Int, Int> = HashMap<Int, Int>()
        sumToCount[0] = 1
        var result = 0
        var sum = 0
        for (i in nums.indices) {
            sum += nums[i]
            if (sumToCount.containsKey(sum - k)) result += sumToCount[sum - k]!!
            sumToCount[sum] = sumToCount.getOrDefault(sum, 0)!! + 1
        }
        return result
    }
}