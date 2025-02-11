package hard

import java.util.*

class `1499-MaxValueofEquation` {
    fun findMaxValueOfEquation(points: Array<IntArray>, k: Int): Int {
        var max = Int.MIN_VALUE

        for(i in points.indices){
            val first = points[i]
            for(j in i+1 until points.size){
                val next = points[j]
                if ( next[0] - first[0] > k ){
                    break;
                } else {
                    max = Math.max(max, first[1] + next[1] + next[0] - first[0])
                }
            }
        }
        return max
    }

    fun findMaxValueOfEquation2(points: Array<IntArray>, k: Int): Int {
        var max = Int.MIN_VALUE
        val queue = LinkedList<Pair<Int, Int>>()
    
        for (i in points.indices) {
            val (xi, yi) = points[i]
    
            // Remove points from the front of the queue that are too far away
            while (queue.isNotEmpty() && xi - queue.peekFirst().first > k) {
                queue.pollFirst()
            }
    
            // Calculate max value with the point at the front of the queue
            if (queue.isNotEmpty()) {
                val (xj, yj) = queue.peekFirst()
                max = maxOf(max, yi + yj + xi - xj)
            }
    
            // Remove points from the back of the queue that are worse than the current point
            while (queue.isNotEmpty() && queue.peekLast().second - queue.peekLast().first <= yi - xi) {
                queue.pollLast()
            }
    
            // Add the current point to the queue
            queue.offerLast(xi to yi)
        }
    
        return max
    }
}