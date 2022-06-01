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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null)  return list2;
        if(list2 == null)  return list1;
        
        ListNode head;
        if(list1.val <= list2.val) {
            head = new ListNode(list1.val);
            list1 = list1.next;
        }
        else {
            head = new ListNode(list2.val);
            list2 = list2.next;
        }
        ListNode curr = head;  

        while(list1 != null || list2 != null) {
            if(list1 == null) {
                curr.next = list2;    
                return head;
            }
            else if(list2 == null) {
                curr.next = list1;
                return head;
            }
            if(list1.val <= list2.val) {
                curr.next = new ListNode(list1.val);
                list1 = list1.next;
            }
            else {
                curr.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            curr = curr.next;
        }
        return head;
    }
}