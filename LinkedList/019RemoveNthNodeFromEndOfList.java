/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int getLen (ListNode head){
        if (head == null){
            return 0;
        }
        int len = 0;
        while (head != null){
            len ++;
            head = head.next;
        }
        return len;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = getLen(head);
        if (head == null || len < n){
            return null;
        }
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode fast = dummyNode;
        ListNode slow = dummyNode;
        while (n > 0){
            fast = fast.next;
            n --;
        }
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummyNode.next;
    }
}
