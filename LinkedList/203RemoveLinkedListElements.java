/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null){
            return head;
        }
        ListNode dummyNode = new ListNode(0);
        ListNode p = dummyNode;
        dummyNode.next = head;
        while(p.next != null){
            if (p.next.val == val){
                p.next = p.next.next;
            }
            else{
                p = p.next;
            }
        }
        return dummyNode.next;
    }
}
