package medium

class `201-BitwiseANDofNumbersRange` {
    fun rangeBitwiseAnd(left: Int, right: Int): Int {
        var n = right
        while(n>left){
            n = n and (n-1)
        }
        return n
    }
}