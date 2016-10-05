/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode dummyHead = new ListNode(0);
        ListNode p = dummyHead;
        ListNode midHead = new ListNode(0);
        ListNode midP = midHead;
        dummyHead.next = head;
        
        while(head != null){
            if (head.val < x){
                p.next = head;
                p = p.next;
            }
            else{
                midP.next = head;
                midP = midP.next;
            }
            head = head.next;
        }
        midP.next = null;
        p.next = midHead.next;
        return dummyHead.next;
    }
}
