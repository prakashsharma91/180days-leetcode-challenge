package hard

class `30-SubstringWithConcatenationOfAllWords` {
    fun findSubstring(s: String, words: Array<String>): List<Int> {
        val wordToFrequency = words.groupingBy { it }.eachCount()

        val wordLength = words.first().length
        val subStringLength = words.size * wordLength

        var x = 0;
        val result = mutableListOf<Int>()
        var y = x + subStringLength
        while(y <= s.length){
            if ( allMatch(s.substring(x, y), wordToFrequency, wordLength) )
                result.add(x)
            x++
            y = x + subStringLength
        }
        return result
    }

    private fun allMatch(s: String, wordsToFrequency: Map<String, Int>, wordLength: Int): Boolean {
        val seenWords = mutableMapOf<String, Int>()
        for (i in s.indices step wordLength) {
            val word = s.substring(i, i + wordLength)
            seenWords[word] = seenWords.getOrDefault(word, 0) + 1
        }
        return seenWords == wordsToFrequency
    }
}

fun main() {
    println( `30-SubstringWithConcatenationOfAllWords`().findSubstring("lingmindraboofooowingdingbarrwingmonkeypoundcake", arrayOf("fooo","barr","wing","ding","wing")))
}