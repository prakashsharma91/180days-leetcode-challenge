package easy

class `303-RangeSumQueryImmutable` {
}

class NumArray(nums: IntArray) {

    private val prefixSumNums: IntArray = IntArray(nums.size)

    init {
        prefixSumNums[0] = nums[0]
        for (i in 1 until nums.size) {
            prefixSumNums[i] = prefixSumNums[i - 1] + nums[i]
        }
    }

    fun sumRange(left: Int, right: Int): Int {
        return if ( left == 0 ){
            prefixSumNums[right]
        } else {
            prefixSumNums[right] - prefixSumNums[left-1]
        }
    }
}