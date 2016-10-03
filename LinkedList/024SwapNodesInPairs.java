/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummyNode = new ListNode(0);
        ListNode p = dummyNode;
        dummyNode.next = head;
        while(p.next != null && p.next.next !=null){
            int a = p.next.val;
            p.next.val = p.next.next.val;
            p.next.next.val = a;
            p = p.next.next;
        }
        return dummyNode.next;
    }
}
