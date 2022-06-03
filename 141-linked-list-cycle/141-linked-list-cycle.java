/**
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;

        ArrayList<ListNode> list = new ArrayList<ListNode>();
        
        while(head.next != null) {
            ListNode next = head.next;
            if(list.contains(next)) return true;
            list.add(head);
            head = head.next;
        }
        return false;
     }
}