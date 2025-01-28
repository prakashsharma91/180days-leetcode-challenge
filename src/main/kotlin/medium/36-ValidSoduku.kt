package medium


fun isValidSudoku(board: Array<CharArray>): Boolean {
    val seen: MutableSet<String> = HashSet<String>()
    for (i in 0..8) {
        for (j in 0..8) {
            val number = board[i][j]
            if (number != '.')
                if (!seen.add("$number in row $i") || !seen.add("$number in column $j") || !seen.add(number.toString() + " in block " + i / 3 + "-" + j / 3)
                ) return false
        }
    }
    return true
}

class `36-ValidSoduku` {
    fun isValidSudoku(board: Array<CharArray>): Boolean {

        var isValid = true;

        for(k in 0 until 9){
            isValid = isValid && isRowValid(board, k) && isColValid(board, k)
            if ( !isValid )
                return false
        }

        isValid = isBoxValid(board, Pair(0, 0), 3)
        isValid = isValid && isBoxValid(board, Pair(0, 3), 3)
        isValid = isValid && isBoxValid(board, Pair(0, 6), 3)
        isValid = isValid && isBoxValid(board, Pair(3, 0), 3)
        isValid = isValid && isBoxValid(board, Pair(3, 3), 3)
        isValid = isValid && isBoxValid(board, Pair(3, 6), 3)
        isValid = isValid && isBoxValid(board, Pair(6, 0), 3)
        isValid = isValid && isBoxValid(board, Pair(6, 3), 3)
        isValid = isValid && isBoxValid(board, Pair(6, 6), 3)
        return isValid
    }

    fun isRowValid(board: Array<CharArray>, row: Int): Boolean {
        val elements = IntArray(9)
        for(j in 0 until 9){
            if ( board[row][j] == '.' ) continue;
            elements[board[row][j]-'0' - 1]++
            if ( elements[board[row][j]-'0' - 1] > 1 )
                return false
        }
        return true
    }

    fun isColValid(board: Array<CharArray>, col: Int): Boolean {
        val elements = IntArray(9)
        for(i in 0 until 9){
            if ( board[i][col] == '.' ) continue;
            elements[board[i][col]-'0' - 1]++
            if ( elements[board[i][col]-'0' - 1] > 1 )
                return false
        }
        return true
    }

    fun isBoxValid(board: Array<CharArray>, rowAndCol: Pair<Int, Int>, size: Int): Boolean {
        val elements = IntArray(9);

        for(i in rowAndCol.first until rowAndCol.first + size){
            for(j in rowAndCol.second until rowAndCol.second + size){
                if ( board[i][j] == '.' ) continue;
                elements[board[i][j]-'0' - 1]++
                if ( elements[board[i][j]-'0' - 1] > 1 )
                    return false
            }
        }
        return true
    }
}

