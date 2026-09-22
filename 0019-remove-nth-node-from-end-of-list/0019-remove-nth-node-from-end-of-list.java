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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ptr1=head,ptr2=head;
        for(int i=0;i<n;i++){
          ptr2=ptr2.next;
        }
        if(ptr2==null) return head.next;
        while(ptr2.next != null){
            ptr2=ptr2.next;
            ptr1=ptr1.next;
        
        }
        ptr1.next=ptr1.next.next;
        return head;
    }
}