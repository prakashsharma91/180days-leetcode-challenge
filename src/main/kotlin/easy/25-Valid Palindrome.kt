package easy

class `25-Valid Palindrome` {
    fun isPalindrome(s: String): Boolean {
        var left = 0
        var right = s.length - 1
        while (left < right) {
            if (!s[left].isLetterOrDigit()) {
                left++
            } else if (!s[right].isLetterOrDigit()) {
                right--
            } else if (s[left].toLowerCase() != s[right].toLowerCase()) {
                return false
            } else {
                left++
                right--
            }
        }
        return true
    }
}