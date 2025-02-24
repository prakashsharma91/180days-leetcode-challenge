package easy

class `205-IsomorphicStrings` {
    fun isIsomorphic(s: String, t: String): Boolean {
        if ( s.length != t.length ) return false
        val map = HashMap<Char, Char>()

        for(i in 0 until s.length){
            val ch1 = s.elementAt(i)
            val ch2 = t.elementAt(i)
            if ( map.containsKey(ch1) ){
                if ( map.get(ch1) != ch2 ){
                    return false;
                }
            } else {
                if ( map.values.contains(ch2) )
                    return false;
                else
                    map[ch1] = ch2
            }
        }
        return true
    }
}