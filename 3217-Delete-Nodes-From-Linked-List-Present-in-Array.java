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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer>s1=new TreeSet<>();

        for (int a:nums){
            s1.add(a);
        }
        ListNode ans=new ListNode(-1);
        ListNode dummy=ans;
        ListNode temp=head;

        while(temp!=null){
            if(!s1.contains(temp.val)){
                dummy.next=temp;
                dummy=dummy.next;
                //temp=temp.next;
            }
           if(temp!=null)  temp=temp.next;
        }

        dummy.next=null;
        return ans.next;
        
    }
}