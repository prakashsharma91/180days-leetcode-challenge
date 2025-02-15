package medium

class `151-ReverseWordsinaString` {
    fun reverseWords(s: String): String {
        val result = mutableListOf<String>()

        var word = ""
        for(i in s.indices.reversed()){
            if ( s[i] == ' ' ){
                if ( word.isNotEmpty() )
                    result.add(word.reversed())
                word = ""
            } else {
                word += s[i]
            }
        }

        if ( word.isNotEmpty() )
            result.add(word.reversed())

        return result.joinToString(" ")
    }

   fun reverseWords2(s: String): String {
       return s.trim().split("\\s+".toRegex()).reversed().joinToString(" ")
   }
}

fun main() {
}