package hard

class `76- MinimumWindowSubstring` {
    fun minWindow(s: String, t: String): String {
        val charCount = IntArray(128) { 0}

        for (c in t){
            charCount[c.toInt()]++
        }

        var right = 0
        var left = 0
        var minLen = Int.MAX_VALUE
        var minLeft = 0
        var count = t.length

        while(right<s.length){
            if ( charCount[s[right].toInt()] > 0){
                count--
            }
            charCount[s[right].toInt()]--

            while (count == 0){
                if ( right - left + 1 < minLen){
                    minLen = right - left + 1
                    minLeft = left
                }

                if ( charCount[s[left].toInt()] >= 0  ){ // Operation on shrink
                    count++
                }
                // shrink
                ++charCount[s[left].toInt()]
                left++
            }
            right++
        }

        return if (minLen == Int.MAX_VALUE) "" else s.substring(minLeft, minLeft + minLen)
    }
}

fun main() {
    `76- MinimumWindowSubstring`().minWindow("ADOBECODEBANC", "ABC")
}