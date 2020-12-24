public class Solution234 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public boolean isPalindrome(ListNode head) {
            ListNode fast = head;
            ListNode slow = head;
            ListNode prev = null;

            if (fast == null || fast.next == null){
                return true;
            }

            while (fast != null && fast.next != null){
                fast = fast.next.next;
                ListNode tempNode = slow.next;
                slow.next = prev;
                prev = slow;
                slow = tempNode;
            }

            ListNode tempPrev = slow;
            ListNode tempStart = prev;
            if (fast != null){
                slow = slow.next;
            }

            while(slow !=null && prev !=null){
                if (slow.val != prev.val){
                    return false;
                }
                slow = slow.next;
                prev = prev.next;
            }

            while(tempStart != null){
                ListNode tempNext = tempStart.next;
                tempStart.next = tempPrev;
                tempPrev = tempStart;
                tempStart = tempNext;
            }

            return true;
        }
    }
}
