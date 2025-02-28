package medium

import java.util.TreeSet

class `438-FindAllAnagramsinaString` {
    fun findAnagrams(s: String, p: String): List<Int> {
        val keyArray = IntArray(26)
        for(i in p.indices){
            keyArray[p.elementAt(i).code]++
        }

        val evalArray = IntArray(26)
        var start = 0
        var result = mutableListOf<Int>()
        for(i in s.indices){
            evalArray[s.elementAt(i).code]++
            if ( i - start + 1 == p.length ){
                if ( match(keyArray, evalArray) )
                    result.add(start)
                evalArray[s.elementAt(start).code]--
                start++
            }
        }
        return result
    }

    fun match(keyArray: IntArray, evalArray: IntArray): Boolean{
        for (i in 0 until 26){
            if ( keyArray[i] != evalArray[i] ){
                return false
            }
        }
        return true
    }
}