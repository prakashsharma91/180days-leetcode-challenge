package easy

class `1512-NumberofGoodPairs` {
    fun numIdenticalPairs(nums: IntArray): Int {
        val map = HashMap<Int, Int>()

        var result = 0
        for(i in nums.indices.reversed()){
            val precedingCount = map.getOrDefault(nums[i], 0)
            result += precedingCount
            map[nums[i]] = precedingCount + 1
        }
        return result
    }
}