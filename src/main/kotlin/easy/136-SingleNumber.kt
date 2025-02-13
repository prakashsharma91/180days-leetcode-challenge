package easy

class `136-SingleNumber` {
    fun singleNumber(nums: IntArray): Int {
        var num = nums[0]
        for(i in 1 until nums.size){
            num = num xor nums[i]
        }
        return num
    }
}