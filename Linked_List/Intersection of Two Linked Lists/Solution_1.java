/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ptrA = headA;
        ListNode ptrB = headB;
        while (ptrA != ptrB) {
            if(ptrA != null & ptrB != null){
                System.out.println("A: " + ptrA.val + "B :" + ptrB.val);
            }
            ptrA = (ptrA != null) ? ptrA.next : headB;
            ptrB = (ptrB != null) ? ptrB.next : headA;
        }

        return ptrA;
    }
}