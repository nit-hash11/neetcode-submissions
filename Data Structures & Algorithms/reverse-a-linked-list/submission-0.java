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
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode prev = null;
        ListNode cur = new ListNode();
        while(head!=null){
            cur = new ListNode(head.val);
            cur.next = prev;
            prev = cur;
            head = head.next;
        }
        return cur;
    }
}
