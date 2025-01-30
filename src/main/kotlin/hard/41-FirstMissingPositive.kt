package hard

class `41-FirstMissingPositive` {
    fun firstMissingPositive(nums: IntArray): Int {

        for(i in nums.indices){
            while ( nums[i] > 0 && nums[i] <= nums.size && nums[i] != nums[nums[i]-1] ){
                swap(nums, i, nums[i]-1)
            }
        }

        for(i in nums.indices){
            if ( nums[i] != i + 1 )
                return i + 1;
        }
        return nums.size + 1
    }

    fun swap(arr: IntArray, i : Int, j : Int){
        val temp = arr[i]
        arr[i] = arr[j]
        arr[j] = temp
    }
}