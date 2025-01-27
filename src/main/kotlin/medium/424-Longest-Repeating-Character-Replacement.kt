package medium

class Solution424 {
    fun characterReplacement(s: String, k: Int): Int {
        val array = IntArray(26)

        var left=0
        var result=0
        var maxOccInWindow = 0

        for(right in s.indices) {
            val charIdx = s.elementAt(right) - 'A'
            array[charIdx]++;
            maxOccInWindow = Math.max(maxOccInWindow, array[charIdx]);
            if ( right - left - maxOccInWindow + 1 > k){
                array[s.elementAt(left) - 'A']--;
                left++;
            }
            result = Math.max(result, right-left+1)
        }
        return result
    }
}