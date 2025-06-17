/*
Q:-30 HARD Reverse Linked List
Given the head of a singly linked list, reverse the list, and return the reversed list.

*/

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode tempnext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tempnext;
        }
        return prev;
    }
}