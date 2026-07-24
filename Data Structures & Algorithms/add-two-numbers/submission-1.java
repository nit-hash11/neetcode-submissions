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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode res = new ListNode();
        ListNode dummy = res;
        while(l1!=null || l2!=null || carry!=0){
            ListNode cur = new ListNode();
            int sum = (l1==null? 0:l1.val) + (l2==null? 0:l2.val) + carry;
            carry = sum/10;
            sum = sum%10;
            l1 = l1!=null?l1.next:null;
            l2 = l2!=null?l2.next:null;
            cur.val = sum;
            res.next = cur;
            res = res.next;
        }
        return dummy.next;
    }
}
