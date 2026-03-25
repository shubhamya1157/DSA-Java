/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {
    struct ListNode dummy;
    dummy.val = -1;
    dummy.next = NULL;

    struct ListNode* tempA = &dummy;
    struct ListNode* tempB = list1;
    struct ListNode* tempC = list2;

    while(tempC != NULL && tempB != NULL){
        if(tempB-> val < tempC -> val ){
            tempA -> next = tempB;
            tempA = tempA -> next;
            tempB = tempB -> next;
        }

        else{
            tempA -> next = tempC;
            tempA = tempA -> next;
            tempC = tempC -> next;
        }  
    }
    if(tempB != NULL)
        tempA->next = tempB;
    else
        tempA->next = tempC;

    return dummy.next;
    
}