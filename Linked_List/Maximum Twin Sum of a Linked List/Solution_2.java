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
    public int pairSum(ListNode head) {
        ListNode mid = head.next;
       ListNode tail = head.next.next;
       ListNode n;
       int max = 0;

       while (tail != null) {
            n = mid.next;
            mid.next = head;
            head = mid;

            mid = n;
            tail = tail.next.next;
       }

       while (mid != null) {
            max = Math.max(max, head.val + mid.val);
            head = head.next;
            mid = mid.next;
       }
        return max;
    }

}