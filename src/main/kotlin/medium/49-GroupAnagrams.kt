package medium

import java.util.*

class `49-GroupAnagrams` {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val resultMap = mutableMapOf<String, MutableList<String>>()

        for(str in strs){
            val key = str.toCharArray().sorted().joinToString("")
            val list = resultMap.getOrDefault(key, mutableListOf())
            list.add(str)
            resultMap[key] = list
        }
        return resultMap.values.toList()
    }

    fun groupAnagrams2(strs: Array<String>): List<List<String>> {
        return strs.groupBy { it.toCharArray().sorted().joinToString("") }.values.toList()
    }
}