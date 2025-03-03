package medium

class `1525-NumberofGoodWaystoSplitaString` {
    fun numSplits(s: String): Int {
        val rightFreqMap = mutableMapOf<Char, Int>()

        s.toCharArray().map { rightFreqMap[it] = rightFreqMap.getOrDefault(it, 0) + 1 }

        val leftFreqMap = mutableMapOf<Char, Int>()
        var count = 0
        for(ch in s.toCharArray()){
            leftFreqMap[ch] = leftFreqMap.getOrDefault(ch, 0) + 1

            rightFreqMap[ch] = rightFreqMap.getOrDefault(ch, 0) - 1
            if ( rightFreqMap.getOrDefault(ch, 0) == 0 )
                rightFreqMap.remove(ch)

            if ( leftFreqMap.size == rightFreqMap.size ){
                count++
            }
        }
        return count
    }
}