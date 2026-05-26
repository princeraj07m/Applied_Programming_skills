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

    public ListNode reverse(ListNode head){
        if(head == null)return null;
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = curr.next;
        while(curr!=null){
            next = curr.next;
            curr.next =  prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public void merge(ListNode h1 , ListNode h2){
        while(h2 != null){
            ListNode next = h1.next;
            h1.next = h2;
            h1 = h2;
            h2 = next;
        }
    }
    public void reorderList(ListNode head) {
        //find mid
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow.next;
        slow.next = null;
        //reverse second half
        ListNode h1 = head;
        ListNode h2 =reverse(mid);


        //merge
        merge(h1 , h2);
    }
}