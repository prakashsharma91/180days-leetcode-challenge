package hard

import java.util.*

class `239-SlidingWindowMaximum` {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
        val treeMap = TreeMap<Int, Int>()
        val result = IntArray(nums.size - k + 1)

        var i = 0
        while( i < k ){
            treeMap[nums[i]] = treeMap.getOrDefault(nums[i], 0) + 1
            i++
        }

        var window = 0
        result[window] = treeMap.keys.last()
        window++

        i = k
        while(i < nums.size){
            val removeElement = nums[i-k]
            if ( treeMap[removeElement] == 1 )
                treeMap.remove(removeElement)
            else {
                treeMap[removeElement] = treeMap.getOrDefault(removeElement, 0) - 1
            }
            treeMap[nums[i]] = treeMap.getOrDefault(nums[i], 0) + 1
            result[window++] = treeMap.keys.last()
            i++
        }
        return result
    }

    fun maxSlidingWindow2(nums: IntArray, k: Int): IntArray {
        val treeMap = TreeMap<Int, Int>()
        val result = IntArray(nums.size - k + 1)
        val deque = LinkedList<Int>()

        for(i in nums.indices){
            if ( deque.isNotEmpty() && deque.peekFirst() == i - k)
                deque.pollFirst()

            while( deque.isNotEmpty() && nums[deque.peekLast()] < nums[i] ){
                deque.pollLast()
            }

            deque.offerLast(i)

            if ( i >= k - 1){
                result[i-k+1] = nums[deque.peekFirst()]
            }
        }
        return result
    }
}

fun main() {
    `239-SlidingWindowMaximum`().maxSlidingWindow2(intArrayOf(1,3,-1,-3,5,3,6,7), 3)
}