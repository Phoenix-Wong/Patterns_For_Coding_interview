/*
Question : Given the head of a Singly LinkedList, write a function to determine if the LinkedList has a cycle in it or not.
*/

package Fast_Slow_Pointer_Pattern_Practice_Questions;

class ListNode {
    int value = 0;
    ListNode next;

    public ListNode(int value) {
        this.value = value;
    }
}

class CheckIsCyclicLinkedList {
    public static void main(String args[]) {
        //region TestCases

        //first test case
        ListNode head = new ListNode(10);
        head.next = new ListNode(11);
        head.next.next = new ListNode(13);
        head.next.next.next = new ListNode(15);
        head.next.next.next = head.next;

        //endregion

        boolean result = CheckIsCyclicLinkedList.hasCycle(head);


        System.out.println(result);

    }


    public static boolean hasCycle(ListNode head) {

        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if (slowPointer == fastPointer) {
                return true;
            }
        }
        return false;
    }
}
