package medium

import java.util.*

class Solution1 {
    fun deckRevealedIncreasing(deck: IntArray): IntArray {
        val queue : Queue<Int> = LinkedList()

        deck.sort();

        for(i in deck.indices)
            queue.offer(i);

        val result = IntArray(deck.size)

        var idx = 0;
        while(queue.isNotEmpty()){
            val currentIndex  = queue.poll();
            result[currentIndex ] = deck[idx++];
            if ( queue.isNotEmpty() )
                queue.offer(queue.poll())
        }
        return result
    }
}

fun main() {
    println(Solution1().deckRevealedIncreasing(intArrayOf(17,13,11,2,3,5,7)))
}