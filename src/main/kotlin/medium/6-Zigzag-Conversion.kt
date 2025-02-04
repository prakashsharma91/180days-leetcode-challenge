package medium


class `6-Zigzag-Conversion` {
    fun convert(s: String, numRows: Int): String {
        if (numRows <= 1) return s

        val rows = MutableList(numRows) { StringBuilder() }
        var currentRow = 0
        var step = 1

        for (char in s) {
            rows[currentRow].append(char)
            if (currentRow == 0) step = 1
            else if (currentRow == numRows - 1) step = -1
            currentRow += step
        }

        return rows.joinToString("")
    }
}