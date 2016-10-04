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
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    private ListNode merge(ListNode left, ListNode right){
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        while(left != null && right != null){
            if (left.val <= right.val){
                p.next = left;
                left = left.next;
            }
            else{
                p.next = right;
                right = right.next;
            }
            p = p.next;
        }
        if (left != null){
            p.next = left;
        }
        if (right != null){
            p.next = right;
        }
        return dummy.next;
    }
    
    public ListNode sortList(ListNode head) {
        // merge sort
        if (head == null || head.next == null){
            return head;
        }
        ListNode mid = findMiddle(head);
        ListNode right = sortList(mid.next);
        mid.next = null; // divide the linked list into two parts
        ListNode left = sortList(head);
        return merge(left,right);
    }
}
