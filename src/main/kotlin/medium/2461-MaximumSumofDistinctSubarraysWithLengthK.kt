package medium

class `2461-MaximumSumofDistinctSubarraysWithLengthK` {
    fun maximumSubarraySum(nums: IntArray, k: Int): Long {
        val map = HashMap<Int, Int>()

        var start = 0
        var sum = 0L
        var maxSum = 0L

        for(i in nums.indices){
            val num = nums[i]
            map[num] = map.getOrDefault(num, 0) + 1
            sum += num

            if ( map.keys.size == k ){
                maxSum = Math.max(maxSum, sum)
            }

            if ( i - start + 1 == k){
                val removedSum = nums[start]
                sum -= removedSum
                if ( map[removedSum]!! == 1 )
                    map.remove(removedSum)
                else
                    map[removedSum] = map.getOrDefault(removedSum, 0) - 1
                start++
            }
        }

        return maxSum
    }
}