package easy

class Solution {

    fun moveZeroes(nums: IntArray): Unit {
        var placeAt = 0;
        var reviewAt = 0;

        while(reviewAt < nums.size){
            if ( nums[reviewAt] != 0 ){
                nums[placeAt] = nums[reviewAt];
                placeAt++;
            }
            reviewAt++;
        }

        while(placeAt < nums.size ){
            nums[placeAt++] = 0;
        }
    }
}

fun main() {
    Solution().moveZeroes(intArrayOf(0, 1, 0, 3, 12))
}