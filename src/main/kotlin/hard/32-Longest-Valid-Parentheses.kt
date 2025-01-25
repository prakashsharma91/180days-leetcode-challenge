package hard

import java.util.Stack

class Solution {
    fun longestValidParentheses(s: String): Int {
        val stack : Stack<Int> = Stack()
        val array = BooleanArray(s.length)

        for(i in s.indices){
          if ( s.elementAt(i) == ')' ) {
              if ( stack.isNotEmpty() ){
                  array[stack.pop()] = true;
                  array[i] = true
              }
          }else {
            stack.push(i)
          }
        }

        var max = 0;
        var tempMax = 0;
        for(element in array){
            if ( element ){
                tempMax++;
            } else {
                tempMax=0;
            }
            max = Math.max(max, tempMax);
        }
        return max
    }
}