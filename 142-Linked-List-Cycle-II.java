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
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        
        
       
        int count=0;
        if(head==null || head.next==null){
            return null;
        }
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                ListNode p1=head;
                ListNode p2=slow;
                while(p1!=p2){
                p1=p1.next;
                p2=p2.next;
            } 
            return p2;
            }
        }
        return null;
    }
}