package medium

class `15-3Sum` {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        var curr = 0
        for(target in nums.indices){

            val existingMap = HashSet<Int>()
            for(j in nums.indices){
                if ( j != target ){
                    if ( existingMap.contains(nums[j] ) )
                        result.add(listOf(nums[target], nums[j], target - nums[j]))
                    else {
                        existingMap.add(target - nums[j])
                    }
                }
            }
        }
        return result
    }
}