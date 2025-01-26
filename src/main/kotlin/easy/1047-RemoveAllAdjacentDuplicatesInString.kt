package easy

import java.util.*

class Solution2 {
    fun removeDuplicates(s: String): String {
        val stack : Stack<Char> = Stack()

        for(i in s.indices){
            val ch = s.elementAt(i);
            if ( stack.isNotEmpty() && stack.peek() == ch){
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        val st : StringBuilder = StringBuilder()
        while(stack.isNotEmpty()){
            st.append(stack.pop())
        }
        return st.reverse().toString()
    }
}