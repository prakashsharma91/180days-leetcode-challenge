package hard

class `42-Trapping-Rain-Water` {
    fun trap(height: IntArray): Int {
        val leftMaxArray = IntArray(height.size)
        val rightMaxArray = IntArray(height.size)
        val minArray = IntArray(height.size)

        var max = 0
        for(i in height.indices){
            max = Math.max(max, height.elementAt(i))
            if ( i == 0 ) continue;
            leftMaxArray[i] = max
        }

        max = 0
        for(i in height.indices.reversed()){
            max = Math.max(max, height.elementAt(i))
            if ( i == height.size-1 ) continue;
            rightMaxArray[i] = max
        }

        var ans = 0
        for(i in height.indices){
            val temp = Math.min(leftMaxArray[i], rightMaxArray[i]) - height[i]
            if ( temp > 0 ){
                ans += temp;
            }
        }
        return ans
    }
}