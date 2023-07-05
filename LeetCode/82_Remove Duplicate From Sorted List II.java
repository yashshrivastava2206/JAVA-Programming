/*
82. Remove Duplicate From Sorted List II
Given the head of a sorted linked list, delete all nodes that have duplicate numbers, 
leaving only distinct numbers from the original list. Return the linked list sorted as well.
*/
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteDuplicates(struct ListNode* head){
    struct ListNode* tempHead=NULL,*temp,*loc;
    int count=0;
    if(head==NULL)
    return head;
    else{
        while(head!=NULL){
            count=0;
            temp=head->next;
            while(temp!=NULL && temp->val==head->val ){
                ++count;
                
                temp=temp->next;
            }
            if(count==0){
                
                struct ListNode* ptr=(struct ListNode*)malloc(sizeof(struct ListNode));
                ptr->val=head->val;
                ptr->next=NULL;
                
                if(tempHead==NULL){
                tempHead=ptr;
                }
                else{
                    loc=tempHead;
                    while(loc->next!=NULL)
                    loc=loc->next;
                    loc->next=ptr;
                    
                }
            }
            head=temp;
        }
        return tempHead;
    }
}
