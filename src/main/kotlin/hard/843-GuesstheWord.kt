package hard

import kotlin.random.Random


class `843-GuesstheWord` {
    fun findSecretWord(wordlist: Array<String>, master: Master) {
        var possibles = wordlist.toMutableList()
        var trials = 0

        while (trials < 30) {
            val testWord = possibles.random()
            val matches = master.guess(testWord)

            if (matches == 6) return

            possibles = possibles.filter { word ->
                matchCountWords(testWord, word) == matches
            }.toMutableList()

            trials++
        }
    }

    private fun matchCountWords(word1: String, word2: String): Int =
        word1.zip(word2).count { (char1, char2) -> char1 == char2 }
}

interface Master {
      fun guess(word: String): Int
}