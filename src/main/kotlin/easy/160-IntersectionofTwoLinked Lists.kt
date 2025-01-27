package easy

class Solution160 {
    fun getIntersectionNode(headA:ListNode?, headB:ListNode?):ListNode? {
        val map = HashSet<ListNode>()

        var head = headA
        while(head != null ){
            map.add(head);
            head = head.next;
        }
        head = headB
        while(head != null){
            if ( map.contains(head) ){
                return head;
            }
            head = head.next;
        }
        return null
    }
}

//fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
//    var ptrA = headA
//    var ptrB = headB
//    while (ptrA != ptrB) { // loop until we found the first common node
//        ptrA = if (ptrA == null) headB else ptrA.next // once we're done with A, move to B
//        ptrB = if (ptrB == null) headA else ptrB.next // once we're done with B, move to A
//    }
//    return ptrA
//}

class ListNode(var `val`: Int) {
       var next: ListNode? = null
   }