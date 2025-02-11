package easy

class `14-Longest Common Prefix` {
    fun longestCommonPrefix(strs: Array<String>): String {
        val stringBuilder = StringBuilder()
        val min = strs.map{ it.length }.min()

        for(i in 0 until min){
            val numberOfStrings = strs.size
            val ch = strs[0].elementAt(i)
            var j = 1
            var match = true
            while(j<numberOfStrings){
                if ( ch != strs[j].elementAt(i) ){
                    match = false
                }
                j++
            }
            if ( match )
                stringBuilder.append(ch)
            else
                break
        }
        return stringBuilder.toString()
    }
}