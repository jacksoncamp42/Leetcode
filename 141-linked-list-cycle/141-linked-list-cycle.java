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
        Set<ListNode> set = new HashSet<>();
        
        while(head.next != null) {
            ListNode next = head.next;
            if(set.contains(next)) return true;
            set.add(head);
            head = head.next;
        }
        return false;
     }
}