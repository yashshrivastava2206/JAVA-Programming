/*
Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.
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
    public ListNode middleNode(ListNode head) {
        if(head.next==null)
        return head;
       int count=0;
       ListNode temp=head;
       while(temp!=null){
           count++;
           temp=temp.next;
       } 
       temp=head;
       int i=0;

       while(i!=count/2){
           
           i++;
           temp=temp.next;
       }
       return temp;

    }
}876. MIddle 
