package easy

class `169-Majority-Element` {
    fun majorityElement(nums: IntArray): Int {
        var count = 0
        var candidate = 0

        for (num in nums) {
            if (count == 0) {
                candidate = num
            }
            count += if (num == candidate) 1 else -1
        }

        return candidate
    }


    fun majorityElementv2(nums: IntArray): Int {
        var ele = nums[0]
        var count = 1

        for(i in 1 until nums.size){
            if ( nums[i] == ele )
                count++
            else {
                if ( --count == 0 ){
                    ele = nums[i]
                    count = 1
                }
            }
        }
        return ele
    }
}