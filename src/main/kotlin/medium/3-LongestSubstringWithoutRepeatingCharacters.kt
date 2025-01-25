package medium

class Solution {

    fun lengthOfLongestSubstring(s: String): Int {
        var start = 0;
        var max = 0;
        var map = mutableMapOf<Char, Int>();

        for(cur in s.indices) {
            if ( map.containsKey(s.elementAt(cur)) ){
                val newStart = map.get(s.elementAt(cur))!!;

                for(i in start..newStart){
                    map.remove(s.elementAt(i))
                }

                start = newStart + 1;
            }
            map.put(s.elementAt(cur), cur);

            max = Math.max(max, cur - start + 1)
        }
        return max;
    }
}