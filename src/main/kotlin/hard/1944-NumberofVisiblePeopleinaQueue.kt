package hard

import java.util.*

class Solution1944 {
    fun canSeePersonsCount(heights: IntArray): IntArray {
        val stack = Stack<Int>()
        val ans = IntArray(heights.size)

        for(i in heights.indices){
            while ( stack.isNotEmpty() && heights[i] > heights[stack.peek()] ){
                ans[stack.pop()]++;
            }
            if( stack.isNotEmpty()){
                ans[stack.peek()]++
            }
            stack.push(i)
        }
        return ans
    }
}

fun main() {
    Solution1944().canSeePersonsCount(intArrayOf(10,6,8,5,11,9)).forEach { println(it) }
}