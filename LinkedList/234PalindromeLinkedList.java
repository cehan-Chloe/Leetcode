/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseLinkedList(ListNode head){
        ListNode prev = null;
        ListNode cur = head;
        ListNode next = null;
        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
    
    public ListNode findMiddle(ListNode head){
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null){
            return true;
        }
        ListNode middleNode = findMiddle(head).next;
        middleNode = reverseLinkedList(middleNode);
        
        while(middleNode != null && head != null && middleNode.val == head.val){
            middleNode = middleNode.next;
            head = head.next;
        }
        return middleNode == null;
    }
}
