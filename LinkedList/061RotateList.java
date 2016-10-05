/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int getLength(ListNode head){
        if (head == null){
            return 0;
        }
        int count = 0;
        while(head != null){
            head = head.next;
            count ++;
        }
        return count;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0){
            return head;
        }
        ListNode dummyHead = new ListNode(0);
        ListNode p = dummyHead;
        dummyHead.next = head;
        ListNode fast = head;
        ListNode slow = head;
        int len = getLength(head);
        if (k >= len){
            k = k % len;
        }
        if (k == 0){
            return head;
        }
        while(k > 0){
            fast = fast.next;
            k --;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        dummyHead.next = slow.next;
        fast.next = head;
        slow.next = null;
        return dummyHead.next;
    }
}
