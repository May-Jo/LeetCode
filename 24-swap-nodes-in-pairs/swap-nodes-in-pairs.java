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
public ListNode swapPairs(ListNode head) {
if (head == null || head.next == null) {
return head;
}

    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode temp = dummy;

    while (temp.next != null && temp.next.next != null) {
        ListNode temp1 = temp.next;
        ListNode temp2 = temp.next.next;

        temp1.next = temp2.next;
        temp2.next = temp1;
        temp.next = temp2;

        temp = temp1;
    }

    return dummy.next;
}


}
