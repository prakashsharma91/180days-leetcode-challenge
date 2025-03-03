package medium

import java.util.*

class `846-HandofStraights` {
    fun isNStraightHand(hand: IntArray, groupSize: Int): Boolean {
        Arrays.sort(hand)
        val freqMap = TreeMap<Int, Int>()
        hand.map{ freqMap[it] = freqMap.getOrDefault(it, 0) + 1}

        while(freqMap.size > 0){
            var curr = freqMap.firstKey()
            var count = 0
            while(freqMap.contains(curr)){
                count++

                freqMap[curr] = freqMap.getOrDefault(curr, 0) - 1
                if ( freqMap.getOrDefault(curr, 0) == 0 ) freqMap.remove(curr)

                curr++
                if ( count == groupSize )
                    break
            }

            if ( count != groupSize ){
                return false
            }
        }
        return true
    }
}