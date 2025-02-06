package medium

class `238-ProductofArrayExceptSelf` {
    fun productExceptSelf(nums: IntArray): IntArray {
        val result = IntArray(nums.size) {1}

        var product = 1
        for(i in nums.indices){
            result[i] = product
            product *= nums[i]
        }

        product = 1
        for(i in nums.indices.reversed()){
            result[i] *= product
            product *= nums[i]
        }

        return result
    }
}