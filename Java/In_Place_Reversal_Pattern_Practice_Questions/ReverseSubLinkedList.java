/*
Question : Given the head of a LinkedList and two positions ‘p’ and ‘q’, reverse the LinkedList from position ‘p’ to ‘q’.
*/

package In_Place_Reversal_Pattern_Practice_Questions;

class ReverseSubLinkedList
{
    public static void main (final String args[])
    {
        //region TestCases
        
        //first test case
       
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int p = 2;
        int q = 4;
        //endregion

        ListNode result = ReverseSubLinkedList.reverse(head, p ,q);

        while (result != null)
        {
            System.out.print(result.value + " -> ");
            result = result.next;
        }
    }



    public static ListNode reverse(ListNode head, final int p, final int q) {
        if (p == q) {
            return head;
        }

        ListNode current = head;
        ListNode previous = null;
        for (int i = 0; current != null && i < p - 1; ++i) {
            previous = current;
            current = current.next;
        }

        ListNode lastNodeOfFirstPart = previous;
        ListNode lastNodeOfSubList = current;
        ListNode next = null;

        for (int i = 0; current != null && i < q - p + 1; i++) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        if (lastNodeOfFirstPart != null) {
            lastNodeOfFirstPart.next = previous;
        } else {
            head = previous;
        }
        lastNodeOfSubList.next = current;

        return head;
    }
}