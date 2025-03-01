package easy

class `234-PalindromeLinkedList` {
    fun isPalindrome(head: ListNode?): Boolean {
        var slow = head
        var fast = head?.next
        while(fast?.next != null){
            slow = slow?.next
            fast = fast.next?.next
        }
        var second = reverseFrom(slow?.next)

        var first = head

        while(second != null){
            if ( second.`val` != first?.`val`)
                return false
            first = first?.next
            second = second.next
        }

        return true
    }

    private fun reverseFrom(head: ListNode?): ListNode? {
        var curr: ListNode? = head
        var prev : ListNode? = null
        while(curr != null){
            val next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        }
        return prev
    }
}