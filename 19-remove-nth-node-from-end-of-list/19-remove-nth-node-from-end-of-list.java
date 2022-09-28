/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode runner = newHead;
        ListNode p = newHead;
        
        while(n > 0) {
            runner = runner.next;
            n--;
        }
        
        while(runner.next != null) {
            p = p.next;
            runner = runner.next;
        }
        p.next = p.next.next;
        return newHead.next;
    }
}