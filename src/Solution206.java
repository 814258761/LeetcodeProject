public class Solution206 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode tempNode = null;
            ListNode prev = null;
            ListNode curr = head;
            while(curr != null){
                tempNode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = tempNode;
            }
            return prev;
        }
    }
}
