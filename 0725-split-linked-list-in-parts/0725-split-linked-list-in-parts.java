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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode temp = head;
        int length = 0;

        while (temp != null) {
            length++;
            temp = temp.next;
        }

        int remainder = length % k;
        int baseSize = length / k;

        ListNode[] result = new ListNode[k];
        temp = head;

        for (int part = 0; part < k && temp != null; part++) {

            int partSize = baseSize + (remainder > 0 ? 1 : 0);

            if (remainder > 0) {
                remainder--;
            }

            result[part] = temp;

            for (int idx = 1; idx < partSize; idx++) {
                temp = temp.next;
            }

            ListNode nextPart = temp.next;
            temp.next = null;
            temp = nextPart;
        }

        return result;
    }
}