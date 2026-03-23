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
    public ListNode insertionSortList(ListNode head) {
        if(head.next==null)
        {
            return head;
        }
        List <Integer>l=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            l.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(l);
        head=null;
        temp=null;
        for (int i = 0; i < l.size(); i++) {
            if (head == null) {
                head = new ListNode(l.get(i));
                temp = head;
            } else {
                temp.next = new ListNode(l.get(i));
                temp = temp.next;
            }
        }
        return head;
    }
}