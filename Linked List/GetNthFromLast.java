// Return Nth node from last of Linked List.

import java.util.*;

public class GetNthFromLast {

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

    public int nthFromLast(Node head, int index) {
        if(head == null)
            return -999;

        Node n = head;
        int count = 0;
        while(n != null) {
            count++;
            n = n.next;
        }

        Node m = head;
        for(int i=1; i < count-index+1; i++){
            m = m.next;
        }
        return m.data;
    }

    public int nthFromLast2Pointers(Node head, int index){
        Node p = head;
        Node q = head;

        for(int i=0; i<index; i++) {
            q = q.next;
        }

        while(q != null) {
            p = p.next;
            q = q.next;
        }
        return p.data;
    }

    public static void main(String[] args) {
        GetNthFromLast llist = new GetNthFromLast();

        llist.append(10);
        llist.append(20);
        llist.append(30);
        llist.append(40);

        llist.printList();

        System.out.print("Enter the index number: ");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();

        System.out.println("Element 2 places from last is: " + llist.nthFromLast(llist.head, index));
        System.out.println("Element 2 places from last using 2 pointers is: " + llist.nthFromLast2Pointers(llist.head, index));

    }
}
