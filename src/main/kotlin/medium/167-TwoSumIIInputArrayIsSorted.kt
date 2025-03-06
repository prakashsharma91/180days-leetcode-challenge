package medium

class `167-TwoSumIIInputArrayIsSorted` {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var x = 0
        var y = 1
        while( y < numbers.size){
            if ( numbers[x] + numbers[y] == target){
                return intArrayOf(x+1, y+1)
            } else if ( numbers[x]+ numbers[y] > target) {
                x++
            } else{
                y++
            }
        }
        return intArrayOf()
    }
}