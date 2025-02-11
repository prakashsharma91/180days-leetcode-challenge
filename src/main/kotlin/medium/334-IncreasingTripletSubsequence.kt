package medium

class `334-IncreasingTripletSubsequence` {
    fun increasingTriplet(nums: IntArray): Boolean {
        var first = Int.MAX_VALUE
        var second = Int.MAX_VALUE

        for(num in nums){
            if ( num > second )
                return true
            else if ( num > first ){
                second = num
            } else {
                first = num
            }
        }

        return false;
    }
}