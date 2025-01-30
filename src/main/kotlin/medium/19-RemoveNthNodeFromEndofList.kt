package medium

class `19-RemoveNthNodeFromEndofList` {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var fast = head
        var k = n
        while(k > 0){
            fast = fast!!.next
            k--;
        }

        if ( fast == null ){
            val afterHead = head!!.next
            head.next = null
            return afterHead
        }

        var slow = head
        while( fast?.next != null ){
            slow = slow!!.next
            fast = fast.next
        }

        slow!!.next = slow.next?.next

        return head;
    }
}

class ListNode(var `val`: Int) {
         var next: ListNode? = null
 }