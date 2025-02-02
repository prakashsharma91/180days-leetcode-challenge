package medium

class `189-RotateArray` {
    fun rotate(nums: IntArray, k: Int): Unit {
        val rotateIdx = nums.size - ( k%nums.size ) // 3 should given 4.
        subRotate(nums, 0, rotateIdx-1)
        subRotate(nums, rotateIdx, nums.size-1)
        subRotate(nums, 0, nums.size-1)
    }

    fun subRotate(nums: IntArray, start: Int, end: Int){
        var s = start
        var e = end
        while(s < e){
            val temp = nums[s]
            nums[s] = nums[e]
            nums[e] = temp
            s++
            e--
        }
    }
}