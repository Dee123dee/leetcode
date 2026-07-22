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
    private ListNode reverse(ListNode head)
    {
        ListNode a=null,b=head,c=b.next;
        while(b!=null)
        {
           b.next = a;
           a = b;
           b = c;
           if(c!=null)
           {
                c = c.next;
           }
        }
        return a;
    }
    public ListNode doubleIt(ListNode head) {
        head = reverse(head);
        int number = 0;
        ListNode temp = head;
        ListNode p = null;
        int carry = 0;
        while(temp!=null)
        {
            int v = temp.val * 2 + carry;
            temp.val = v % 10;
            carry = v/10;
            p = temp;
            temp = temp.next;
        }
        if(carry>0)
        {
            p.next = new ListNode(carry);
        }
        head = reverse(head);
        return head;
    }
}