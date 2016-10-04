/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode dummyHead = new ListNode(0);
        // this is not needed. dummyHead.next = head;
        while(head != null){
            ListNode p = dummyHead;
            while(p.next != null && head.val > p.next.val){
                p = p.next;
            }
            ListNode tmp = head.next;
            head.next = p.next;
			p.next = head;
            head = tmp;
        }
        return dummyHead.next;
    }
}
