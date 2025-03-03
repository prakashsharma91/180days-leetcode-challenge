package medium

class `792-NumberofMatchingSubsequences` {
    fun numMatchingSubseq(s: String, words: Array<String>): Int {

        var result = 0

        for(word in words){
            var count = 0
            var curr = 0
            for(ch in s.toCharArray()){
                if ( ch == word.elementAt(curr) && curr < word.length ){
                    curr++
                    count++
                }
            }
            if ( count == word.length ){
                result++
            }
        }

        return result
    }
}