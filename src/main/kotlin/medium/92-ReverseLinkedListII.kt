package medium

class `92-ReverseLinkedListII` {
    fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
        var left = left
        var right = right
        val dummyNode = ListNode(-1)
        dummyNode.next = head

        var leftNode = dummyNode
        while(left-- > 1){
            leftNode = leftNode.next!!
        }

        var rightNode : ListNode? = dummyNode
        while(right-- >= 0){
            rightNode = rightNode?.next
        }
        reverse(leftNode, rightNode)
        return dummyNode.next
    }

    fun reverse(prev: ListNode, end: ListNode?){
        var prev = prev
        val start = prev.next
        while(start?.next !== end) {
            val nextNode = start?.next
            start?.next = nextNode?.next
            nextNode?.next = prev.next
            prev.next = nextNode
        }
    }
}