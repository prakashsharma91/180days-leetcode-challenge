package easy

class `219-ContainsDuplicateII` {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val map = HashSet<Int>()
        var left = 0
        map.add(nums[0])
        for(i in nums.indices){
            // expand
            map.add(nums[i])

            // duplicate element
            if ( map.size < i - left + 1 ){
                return true
            }

            // shrink
            if ( map.size > k ){
                map.remove(nums[left])
                left++
            }
        }
        return false
    }
}