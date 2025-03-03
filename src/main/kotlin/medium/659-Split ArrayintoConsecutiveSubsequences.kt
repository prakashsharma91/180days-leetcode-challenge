package medium

import java.util.*

class `659-Split ArrayintoConsecutiveSubsequences` {
    fun isPossible(nums: IntArray): Boolean {
        val map = TreeMap <Int, Int>()
        nums.forEach { map[it] = map.getOrDefault(it, 0) + 1}

        while( map.size > 0 ){
            var curr = map.firstKey()
            var count = 0
            while( map.getOrDefault(curr, 0) > 0){
                count++
                map[curr] = map.getOrDefault(curr, 0) - 1
                if ( map.getOrDefault(curr, 0) == 0) map.remove(curr)

                if ( count >= 3 && map.containsKey(curr) && map.containsKey(curr + 1) && map.getOrDefault(curr + 1, 0) <= map.getOrDefault(curr, 0))
                    break

                curr++
            }
            if ( count < 3){
                return false
            }
        }
        return true
    }
}

fun main() {
    `659-Split ArrayintoConsecutiveSubsequences`().isPossible(intArrayOf(1,2,3,3,4,5))
}