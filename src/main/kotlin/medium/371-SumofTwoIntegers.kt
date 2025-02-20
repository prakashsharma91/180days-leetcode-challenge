package medium

class `371-SumofTwoIntegers` {
    fun getSum(a: Int, b: Int): Int {
        var x = a
        var y = b
        while(y != 0){
            val carry = x and y
            x = x xor y
            y = carry shl 1
        }
        return x
    }
}

fun main() {
    `371-SumofTwoIntegers`().getSum(1, 2)
}