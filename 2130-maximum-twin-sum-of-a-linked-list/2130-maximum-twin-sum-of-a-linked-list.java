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
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head.next;         
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode curr=slow.next;
        slow.next=null;
        ListNode next=null;
        ListNode prev=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        int max=0;
        while(head!=null){
            int sum=head.val+prev.val;
            head=head.next;
            prev=prev.next;
            max=Math.max(max,sum);
        }return max;

    }
}