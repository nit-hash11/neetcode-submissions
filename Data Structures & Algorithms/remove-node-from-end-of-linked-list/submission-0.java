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

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode traverser = head;
        ListNode deleter = dummy;
        while(n>0){
            traverser = traverser.next;
            n--;
        }
        while(traverser!=null){
            traverser = traverser.next;
            deleter = deleter.next;
        }
        deleter.next = deleter.next.next;
        return dummy.next;
    }
}
