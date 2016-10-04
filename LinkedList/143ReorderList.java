/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    private ListNode findMiddle(ListNode head){
        if (head == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    private ListNode reverseList(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode cur = head;
        ListNode next = null;
        while(cur != null){
            // everytime the relation of cur and prev is reversed.
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
    
    private void merge(ListNode left, ListNode right) {
        int index = 0;
        ListNode dummy = new ListNode(0);
        while (left != null && right != null) {
            if (index % 2 == 0) {
                dummy.next = left;
                left = left.next;
            } else {
                dummy.next = right;
                right = right.next;
            }
            dummy = dummy.next;
            index ++;
        }
        if (left != null) {
            dummy.next = left;
        } else {
            dummy.next = right;
        }
    }

    
    public void reorderList(ListNode head) {
        if (head == null || head.next == null){
            return;
        }
        ListNode mid = findMiddle(head);
        ListNode midHead = reverseList(mid.next);
        mid.next = null;
        merge(head, midHead);
    }
}
