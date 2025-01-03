class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode left = head;
        ListNode right = head;
        for(int i = 0; i < n; i++)  {
            right = right.next;
        }
        if (right == null)  {
            return head.next;
        }
        while (right.next != null)    {
            left = left.next;
            right = right.next;
        }
        left.next = left.next.next;
        return head; 
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
// head = [1,2,3,4,5], n = 2