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
        int count =0;
        ListNode var= head;
        ListNode temp = head; 
        int start =0;
        

        while(var!= null){
            count++;
            var = var.next;
        }

        if(count == n){
            return head.next;
        }

        while(start<(count-n)-1){
            temp = temp.next;
            start++;
        }
        temp.next = temp.next.next;

        return head;
    }
}