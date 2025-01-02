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
    public ListNode reverse(ListNode temp){
        if(temp==null||temp.next==null){
            return temp;
        }
        ListNode newhead=reverse(temp.next);
        ListNode front=temp.next;
        front.next=temp;
        temp.next=null;
        return newhead;

    }
    public ListNode doubleIt(ListNode head) {
        ListNode newnode=reverse(head);

        ListNode temp=newnode;
        int num=0,carry=0,sum=0;
        while(temp!=null){
            carry=num;  //if we put the carry in next step we will get error:
             sum=num+temp.val*2;
            if(sum>=10){
                temp.val=sum%10;
                num=sum/10;
            }
            else if(sum<10){
                temp.val=sum;
                num=0;
            }

            temp=temp.next;
        } 
        if(num==1){
            ListNode headd=reverse(newnode);
            ListNode newn=new ListNode(num);
            newn.next=headd;
            headd=newn;
            return headd;
        }
        ListNode headd=reverse(newnode);
         return headd;
        


        
        
    }
}