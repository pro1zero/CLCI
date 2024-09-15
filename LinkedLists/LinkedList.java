package LinkedLists;

public class LinkedList {
    public Node head;

    public LinkedList(){
        this.head = null;
    }

    public Node add(int value){
        if (head == null){
            head = new Node(value);
            return head;
        }
        Node newNode = new Node(value);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public static class Node{
        public Node next;
        public int value;

        public Node(int value){
            this.value = value;
            this.next = null;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
