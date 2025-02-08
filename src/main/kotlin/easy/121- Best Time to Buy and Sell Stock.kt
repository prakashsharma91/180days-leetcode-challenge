package easy

class `121- Best Time to Buy and Sell Stock` {
    fun maxProfit(prices: IntArray): Int {
        var minPrice = Int.MAX_VALUE
        var maxProfit = 0

        for (price in prices) {
            if (price < minPrice) {
                minPrice = price
            } else {
                maxProfit = maxOf(maxProfit, price - minPrice)
            }
        }

        return maxProfit
    }
}