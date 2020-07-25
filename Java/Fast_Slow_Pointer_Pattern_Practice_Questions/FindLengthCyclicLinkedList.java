/*
Question : Given the head of a LinkedList with a cycle, find the length of the cycle.
*/

package Fast_Slow_Pointer_Pattern_Practice_Questions;

class FindLengthCyclicLinkedList
{
    public static void main (String args[])
    {
        //region TestCases
        
        //first test case
        ListNode head = new ListNode(10);
        head.next = new ListNode(11);
        head.next.next = new ListNode(13);
        head.next.next.next = new ListNode(15);
        head.next.next.next.next = head.next;

        //endregion

        int result = FindLengthCyclicLinkedList.getLengthOfCycle(head);

        
        System.out.println(result);            
        
    }



    public static int getLengthOfCycle(ListNode head)
    {

        int length = 0;
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while (fastPointer != null && fastPointer.next != null)
        {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if(slowPointer == fastPointer)
            {
                fastPointer = fastPointer.next;
                length = 1;
                while(slowPointer != fastPointer)
                {
                    length++;
                    fastPointer = fastPointer.next;
                }
                break;
            }
        }
        return length;
        
       
    }
}