/*
You are given the head of a linked list. Delete the middle node, and return the head of the modified linked list.

The middle node of a linked list of size n is the ⌊n / 2⌋th node from the start using 0-based indexing, where ⌊x⌋ denotes the largest integer less than or equal to x.

For n = 1, 2, 3, 4, and 5, the middle nodes are 0, 1, 1, 2, and 2, respectively.
*/
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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null)
        return null;
        else if(head.next.next==null){
            head.next=null;
            return head;
        }
       int count=0;
       ListNode temp=head;
       while(temp!=null){
           count++;
           temp=temp.next;
       } 
       temp=head;
       int i=0;

       while(temp!=null){
           if(i+1==count/2){
               ListNode loc= temp.next;
               temp.next=loc.next;
               break;
           }
           i++;
           temp=temp.next;
       }
       return head;
    }
}
