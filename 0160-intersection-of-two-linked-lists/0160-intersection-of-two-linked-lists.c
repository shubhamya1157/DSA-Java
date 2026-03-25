/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode *getIntersectionNode(struct ListNode *headA, struct ListNode *headB) {
    
    struct ListNode* tempA = headA;
    struct ListNode* tempB = headB;
    int lenA = 0;
    int lenB = 0;

    while(tempA != NULL){
        lenA++;
        tempA = tempA -> next;
    }

    while(tempB != NULL){
        lenB++;
        tempB = tempB -> next;
    }
    tempA = headA;
    tempB = headB;

    if(lenA > lenB){
        for(int i = 0; i < lenA -lenB;i++){
            tempA = tempA -> next;
        }

        while(tempA !=  tempB){
            tempA = tempA -> next;
            tempB = tempB -> next;
        }
        return tempA;
    }

    else{

      for(int i = 0; i < lenB -lenA;i++){
         tempB = tempB -> next;
        }

        while(tempA != tempB){
            tempA = tempA -> next;
            tempB = tempB -> next;
        }
        return tempB;

    }

}