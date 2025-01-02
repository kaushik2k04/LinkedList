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
    public ListNode reverse(ListNode headd){
        if(headd==null||headd.next==null){
            return headd;
        }
        ListNode newnode=reverse(headd.next);
        ListNode front=headd.next;
        front.next=headd;
        headd.next=null;
        return newnode;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null &&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newhead=reverse(slow.next);

        ListNode first=head;
        ListNode second=newhead;
        int c=0;
        while(second!=null){
            if(first.val!=second.val){
                c++;
                return false;
            }
            second=second.next;
            first=first.next;
        }
       if(c==0) return true;

       return false;
    }
}