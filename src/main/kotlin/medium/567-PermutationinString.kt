package medium

class `567-PermutationinString` {
    fun checkInclusion(s1: String, s2: String): Boolean {
        val s1Map = IntArray(26)

        for(ch in s1.toCharArray()){
            s1Map[ch-'a']++
        }

        val s2Map = IntArray(26)
        var start = 0
        for(i in s2.indices){
            val ch = s2.elementAt(i)
            s2Map[ch-'a']++

            if ( equals(s1Map, s2Map) )
                return true

            if ( i - start + 1 >= s1.length){
                s2Map[s2.elementAt(start)-'a']--
                start++
            }
        }
        return false
    }

    fun equals(s1: IntArray, s2: IntArray) : Boolean{
        for(i in 0 until 26){
            if ( s1[i] != s2[i] )
                return false
        }
        return true
    }
}

fun main() {
    `567-PermutationinString`().checkInclusion("a", "bab")
}