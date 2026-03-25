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
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null)
            return head;
        List<Integer> small = new ArrayList<>();
        List<Integer> large = new ArrayList<>();

        ListNode temp = head;
        while (temp != null) {
            int val = temp.val;
            if (val < x)
                small.add(val);
            else
                large.add(val);
            temp = temp.next;
        }

        temp = head;
        if (small.size() > 0) {
            for (int i = 0; i < small.size(); i++) {
                temp.val = small.get(i);
                temp = temp.next;
            }
        }
        if (large.size() > 0) {
            for (int i = 0; i < large.size(); i++) {
                temp.val = large.get(i);
                temp = temp.next;
            }
        }
        return head;
    }
}