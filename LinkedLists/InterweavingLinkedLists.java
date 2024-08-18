package LinkedLists;

public class InterweavingLinkedLists {

    public static void interweavingLLsEfficient(LinkedList.Node l1, LinkedList.Node l2){
        LinkedList.Node t1 = l1, t2 = l2;
        while(t1 != null && t2 != null){
            LinkedList.Node temp1 = t1.next;
            LinkedList.Node temp2 = t2.next;

            t1.next = t2;
            if (temp1 != null) t2.next = temp1;

            t1 = temp1;
            t2 = temp2;
        }
        while(l1 != null){
            System.out.println(l1.value);
            l1 = l1.next;
        }
    }
    public static void interweavingLLs(LinkedList.Node l1, LinkedList.Node l2){
        LinkedList.Node result = new LinkedList.Node(-1), temp = result;
        LinkedList.Node t1 = l1, t2 = l2;

        while(t1 != null || t2 != null){
            if (t1 != null){
                temp.next = t1;
                t1 = t1.next;
                temp = temp.next;
            }
            if (t2 != null){
                temp.next = t2;
                t2 = t2.next;
                temp = temp.next;
            }
        }
        result = result.next;
        while(result != null){
            System.out.println(result.value);
            result = result.next;
        }
    }
}
