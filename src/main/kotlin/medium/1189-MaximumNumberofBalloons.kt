package medium

class `1189-MaximumNumberofBalloons` {
    fun maxNumberOfBalloons(text: String): Int {
        val map = HashMap<Char, Int>()

        for(ch in text.toCharArray()){
            map[ch] = map.getOrDefault(ch, 0) + 1
        }

        var num = Int.MAX_VALUE
        num = Math.min(num, map.getOrDefault('b', 0))
        num = Math.min(num, map.getOrDefault('a', 0))
        num = Math.min(num, map.getOrDefault('l', 0)/2)
        num = Math.min(num, map.getOrDefault('o', 0)/2)
        num = Math.min(num, map.getOrDefault('n', 0))
        return num
    }
}