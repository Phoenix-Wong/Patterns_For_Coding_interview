/*
Question : Given the head of a Singly LinkedList, reverse the LinkedList. Write a function to return the new head of the reversed LinkedList.
*/

package In_Place_Reversal_Pattern_Practice_Questions;

class ListNode {
    int value;
    ListNode next;

    public ListNode(int value) {
        this.value = value;
    }

    ;
}

class ReverseLinkedList {
    public static void main(String args[]) {
        //region TestCases

        //first test case

        ListNode head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(8);
        head.next.next.next.next = new ListNode(10);
        //endregion

        ListNode result = ReverseLinkedList.reverse(head);

        while (result != null) {
            System.out.print(result.value + " -> ");
            result = result.next;
        }
    }


    public static ListNode reverse(ListNode head) {
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while (current != null) {
            //saving next node
            next = current.next;
            //moving opposite direction
            current.next = previous;
            //moving ahead
            previous = current;
            current = next;
        }

        return previous;
    }
}
