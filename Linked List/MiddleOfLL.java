// Print Middle element of a Linked List.

public class MiddleOfLL {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void append(int new_data) {
        if(head == null) {
            head = new Node(new_data);
            return;
        }
        Node new_node = new Node(new_data);

        Node n = head;
        while(n.next != null) {
            n = n.next;
        }
        n.next = new_node;
    }

    public void printList() {
        Node n = head;
        while(n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    public int middleOfLL(Node head) {
        Node fast = head;
        Node slow = head;

        if(head != null) {
            while(fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
        }
        return slow.data;
    }

    public int middleOfLLMethod2(Node head) {
        Node mid = head;
        Node n = head;
        int count = 0;

        while(n != null) {
            if(count%2 != 0) {
                mid = mid.next;
            }
            count++;
            n = n.next;
        }
        return mid.data;
    }

    public static void main(String[] args) {
        MiddleOfLL llist = new MiddleOfLL();

        llist.append(10);
        llist.append(20);
        llist.append(30);
        llist.append(40);
        llist.append(50);

        llist.printList();

        System.out.println("Using 2 pointers, the middle element is: " + llist.middleOfLL(llist.head));
        System.out.println("Using mid element variable & a counter, the middle element is: " +llist.middleOfLLMethod2(llist.head));
    }
}
