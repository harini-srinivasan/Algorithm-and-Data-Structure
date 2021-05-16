/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head ==null || head.next==null) {
            return head;
        }
        ListNode temphead = head;
        while(temphead!=null && temphead.next!=null){
            int temp = temphead.val;
            temphead.val=temphead.next.val;
            temphead.next.val = temp;
            
            temphead = temphead.next.next;
        }
        return head;
    }
}
