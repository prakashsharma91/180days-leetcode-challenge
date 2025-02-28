package medium

import java.util.*
import kotlin.collections.HashMap

class `767-ReorganizeString` {
    fun reorganizeString(s: String): String {
        val map = HashMap<Char, Int>();

        for(c in s.toCharArray()){
            map[c] = map.getOrDefault(c, 0) + 1;
        }

        val queue = PriorityQueue<Char> { a, b -> map[b]!! - map[a]!! }
        queue.addAll(map.keys)

        val res = StringBuilder()
        while(queue.size >= 2){
            val ch1 = queue.poll()
            val ch2 = queue.poll()

            res.append(ch1)
            res.append(ch2)

            map[ch1] = map.getOrDefault(ch1, 0) - 1;
            map[ch2] = map.getOrDefault(ch2, 0) - 1;

            if ( map.getOrDefault(ch1, 0) > 0 ){
                queue.add(ch1)
            }

            if ( map.getOrDefault(ch2, 0) > 0 ){
                queue.add(ch2)
            }
        }

        while ( queue.isNotEmpty() ){
            res.append(queue.poll())
        }

        return res.toString()
    }
}