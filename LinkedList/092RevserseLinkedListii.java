/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m >= n || head == null){
            return head;
        }
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode prevM = dummyNode;
        
        for (int i = 1; i < m; i++) {
            if (prevM == null) {
                return null;
            }
            prevM = prevM.next;
        }
        
        ListNode mNode = prevM.next;
        ListNode nNode = mNode;
        ListNode postN = mNode.next;
        
        for (int i = m; i < n; i++){
            if (postN == null){
                return null;
            }
            ListNode tmp = postN.next;
            postN.next = nNode;
            nNode = postN;
            postN = tmp;
        }
        mNode.next = postN;
        prevM.next = nNode;
        
        return dummyNode.next;
    }
}
