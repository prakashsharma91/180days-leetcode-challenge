package easy

class `26-RemoveDuplicatesfromSortedArray` {
    fun removeDuplicates(nums: IntArray): Int {
        var curr = nums.first()
        var p = 0
        for (i in 1 until nums.size){
            if ( curr != nums[i] ){
                nums[++p] = nums[i]
                curr = nums[p]
            }
        }
        return p + 1
    }
}