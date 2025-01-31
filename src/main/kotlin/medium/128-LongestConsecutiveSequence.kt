package medium

import com.sun.jdi.IntegerType
import java.util.*

class `128-LongestConsecutiveSequence` {
    fun longestConsecutive(nums: IntArray): Int {
        val treeSet = TreeSet<Int>()

        for(i in nums.indices){
            treeSet.add(nums[i])
        }

        var result = 1
        var max = 1;
        var prevElement = Int.MIN_VALUE
        for(ele in treeSet){
            if ( ele == (prevElement + 1) ){
                result ++;
                max = Math.max(max, result)
            } else {
                result = 1;
            }
            prevElement = ele
        }

        return result;
    }
}

fun main() {
    `128-LongestConsecutiveSequence`().longestConsecutive(intArrayOf(100,4,200,1,3,2))
}