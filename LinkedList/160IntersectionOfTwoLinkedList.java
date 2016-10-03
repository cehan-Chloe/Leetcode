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
    public int getLength(ListNode head){
        if (head == null){
            return 0;
        }
        int len = 0;
        while(head != null){
            head = head.next;
            len ++;
        }
        return len;
    }
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headB == null || headA == null){
            return null;
        }
        int lenA = getLength(headA);
        int lenB = getLength(headB);
        if (lenA > lenB){
            while (lenA > lenB){
                headA = headA.next;
                lenA--;
            }
        }
        else{
           while (lenB > lenA) {
               headB = headB.next;
               lenB--;
            }
        }
        
        while (headA != null){
            if (headA.val == headB.val){
                return headA;
            }
            else{
                headA = headA.next;
                headB = headB.next;
            }
        }
        return null;
    }
}
