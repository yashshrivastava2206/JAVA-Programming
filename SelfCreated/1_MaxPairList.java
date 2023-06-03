/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
//Program to find the maximum pair in linked list
//eg. list=[1,4,7,5,2,6,9,5,3];
//Max pair=[6,9] Output=9+6=15
int pairSum(struct ListNode* head){
    struct ListNode* temp;
    int max=0;
    if(head==NULL || (head)->next==NULL)
    return 0;
    else{
        temp=head;
        while(temp->next!=NULL){
            struct ListNode* loc=temp;
            temp=temp->next;
            int sum=loc->val+temp->val;
            if((sum)>max)
            max=sum;
        }
    }
    return max;
}
