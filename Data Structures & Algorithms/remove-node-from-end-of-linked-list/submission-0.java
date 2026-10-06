class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode left = dummy;
        ListNode right = dummy;

        // Move right n steps ahead
        for (int i = 0; i < n; i++) {
            right = right.next;
        }

        // Move both until right reaches the last node
        while (right.next != null) {
            left = left.next;
            right = right.next;
        }

        // Remove the nth node from the end
        left.next = left.next.next;

        return dummy.next;
    }
}