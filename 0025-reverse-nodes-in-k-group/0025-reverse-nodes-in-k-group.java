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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode ans = new ListNode(900000);
        ListNode rans = ans;
        while(temp != null){
            int i = 1;
            ListNode first = temp;
            ListNode second = null;
            while(i < k && temp!= null){
                temp = temp.next;
                i ++ ;
            }
            if(i == k && temp != null){
              second = temp;
              temp = temp.next;
              second.next = null;
              ans.next = solve(first);
              ans = first;
              first.next = temp;
            }
            
            
        }
        return rans.next;
    }ListNode solve(ListNode head){
                ListNode prev = null;
                ListNode curr = head;

               while(curr != null){

               ListNode nextNode = curr.next;

               curr.next = prev;

               prev = curr;
               curr = nextNode;
                 }

    return prev;
    }
}