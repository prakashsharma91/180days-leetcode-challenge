package medium

class `2348-Number of Zero-Filled Subarrays` {
    fun zeroFilledSubarray(nums: IntArray): Long {
        var res = 0L
        var count = 0
        val n = nums.size

        for(i in 0 until n){
            if(nums[i] == 0){
                count++
            }else{
                count = 0
            }
            res += count
        }
        return res
    }
}