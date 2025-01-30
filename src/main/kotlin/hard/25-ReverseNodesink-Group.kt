package hard

class `25-ReverseNodesink-Group` {
    fun reverseKGroup(head: ListNode?, k: Int): ListNode? {
        var dummy = ListNode(0)
        dummy.next = head
        var prev = dummy
        var start = head;
        while(true){
            // find S, E
            var end = start

            var i = k
            while( i-- > 1 && end != null ){
                end = end.next
            }
            if ( end == null )
                break

            val nextStart = end.next
            swap(prev, k);

            // move
            prev = start!!
            start = nextStart
        }
        return dummy.next;
    }

    // psxyz -> pxsyx -> pxysz -> pxyzs
    fun swap(prev: ListNode, k : Int){
        var start = prev.next;
        var i = k
        while(i-- > 1 && start!!.next != null){
            var nextNode = start.next;
            start.next = nextNode!!.next;
            nextNode.next = prev.next;
            prev.next = nextNode;
        }
    }
}

class ListNode(var `val`: Int) {
       var next: ListNode? = null
 }


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//class Solution {
//    public ListNode reverseKGroup(ListNode head, int k) {
//        ListNode dummy = new ListNode(0);
//        dummy.next = head;
//
//        ListNode prev = dummy;
//        ListNode start = head;
//
//        while(true){
//            ListNode end = findEnd(start, k);
//            if ( end == null )
//                break;
//            ListNode nextStart = end.next;
//
//            swap(prev, k);
//
//            prev = start;
//            start = nextStart;
//        }
//        return dummy.next;
//    }
//
//    public static void swap(ListNode prev, int k){
//        ListNode start = prev.next;
//        while(k > 1 && start.next != null){
//            ListNode nextNode = start.next;
//            start.next = nextNode.next;
//            nextNode.next = prev.next;
//            prev.next = nextNode;
//            k--;
//        }
//    }
//
//    public static ListNode findEnd(ListNode start, int k){
//        ListNode end = start;
//        while( k > 1 && end != null ){
//            end = end.next;
//            k--;
//        }
//        return end;
//    }
//}