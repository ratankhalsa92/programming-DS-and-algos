// Count
import java.util.*;

public class CountOccurences {
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

    public int countOccurences(Node head, int key) {
        int count = 0;
        if(head == null)
            return 0;

        Node n = head;
        while(n != null) {
            if(n.data == key)
                count++;
            n = n.next;
        }
        return count;
    }

    public int countOccurencesRecursively(Node head, int key) {
        if(head == null)
            return 0;

        if(head.data == key)
            return 1 + countOccurencesRecursively(head.next, key);

        return countOccurencesRecursively(head.next, key);
    }

    public static void main(String[] args) {
        CountOccurences llist = new CountOccurences();

        llist.append(10);
        llist.append(20);
        llist.append(30);
        llist.append(40);
        llist.append(50);
        llist.append(20);
        llist.append(20);
        llist.append(20);
        llist.append(20);

        llist.printList();

        System.out.print("Enter the value: ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        System.out.println("The given key occurs " + llist.countOccurences(llist.head, key) + " times");
        System.out.println("Using Recursion, the given key occurs " + llist.countOccurencesRecursively(llist.head, key) + " times");
    }
}
