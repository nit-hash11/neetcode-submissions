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
            int sum = 0;
            if(l1!=null){
                sum+=l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2 = l2.next;
            }
            if(carry!=0){
                sum+=carry;
                carry = 0;
            }
            if(sum>9){
                carry = sum/10;
                sum = sum%10;
            }
            cur.val = sum;
            res.next = cur;
            res = res.next;
        }
        return dummy.next;
    }
}
