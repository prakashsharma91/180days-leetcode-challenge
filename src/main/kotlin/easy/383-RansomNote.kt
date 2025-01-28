package easy

class Solution383 {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val map = HashMap<Char, Int>()

        for(i in magazine.indices){
            map.put(magazine.elementAt(i), map.getOrDefault(magazine.elementAt(i), 0) + 1)
        }

        for(i in ransomNote.indices){
            if ( map.getOrDefault(ransomNote.elementAt(i), 0) > 0){
                map.put(ransomNote.elementAt(i), map.getOrDefault(ransomNote.elementAt(i), 0) - 1)
            } else {
                return false
            }
        }
        return true;
    }
}