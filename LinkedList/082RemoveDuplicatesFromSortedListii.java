/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode prev = dummyHead;
        while(prev.next != null){
            ListNode tmp = prev.next;
            int val = tmp.val;
            int count = 0;
            while(tmp != null && tmp.val == val){
                count ++;
                tmp = tmp.next;
            }
            if (count > 1){
                prev.next = tmp;
            }
            else{
                prev = prev.next;
            }
        }
        return dummyHead.next;
    }
}
