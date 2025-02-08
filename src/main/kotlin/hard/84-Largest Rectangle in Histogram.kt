package hard

import java.util.*

class `84-Largest Rectangle in Histogram` {
    fun largestRectangleArea(heights: IntArray): Int {
        val stack = Stack<Int>()
        var maxArea = 0

        for(i in 0 until heights.size+1){
            val currHeight = if (i== heights.size) 0 else heights[i]

            while(stack.isNotEmpty() && heights[stack.peek()] > currHeight){
                val height = heights[stack.pop()]
                val width = if (stack.isEmpty()) i else i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width)
            }
            stack.push(i)
        }
        return maxArea
    }
}