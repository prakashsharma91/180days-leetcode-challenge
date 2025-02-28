package easy

class `643-MaximumAverageSubarray I` {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var sum = 0.0
        var avg = -1000000.0
        var start = 0
        for(i in nums.indices){
            sum += nums[i]
            if (i - start + 1 == k){
                avg = Math.max(sum/k, avg)
                sum -= nums[start]
                start++;
            }
        }
        return avg
    }
}