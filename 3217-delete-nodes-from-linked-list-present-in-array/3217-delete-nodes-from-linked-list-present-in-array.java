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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode curr = null;
        ListNode temp = head;
        HashSet<Integer>set = new HashSet<>();
        for(int i : nums)
        {
            set.add(i);
        }

        // if(head.length==1)
        // {
        //     if(set.contains(temp.val))
        //     {
        //         return null;
        //     }
        //     return head;
        // }

        while(temp!=null)
        {
            if(set.contains(temp.val))
            {
                if(temp==head)
                {
                    temp = temp.next;
                    head = head.next;
                }
                else
                {
                    temp = temp.next;
                    curr.next = temp;
                }
            }
            else
            {
                curr = temp;
                temp = temp.next;
            }
        }

        return head;
    }
}