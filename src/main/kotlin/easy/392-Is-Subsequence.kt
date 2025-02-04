package easy

class `392-Is-Subsequence` {
    fun isSubsequence(s: String, t: String): Boolean {
        var sIndex = 0
        for (char in t) {
            if (sIndex < s.length && char == s[sIndex]) {
                sIndex++
            }
        }
        return sIndex == s.length
    }
}