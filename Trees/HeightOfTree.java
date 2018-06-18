// Calculate the Height of a Binary Search Tree

import java.util.*;

public class HeightOfTree {
    Node root;

    public Node insert(Node root, int data) {
        Node node = new Node(data);

        if (root == null)
            return node;

        Node parent = null;
        Node current = root;

        while (current != null) {
            parent = current;
            if (current.data <= data)
                current = current.right;
            else
                current = current.left;
        }

        if (parent.data <= data)
            parent.right = node;
        else
            parent.left = node;

        return root;
    }

    public int heightOfTree(Node root) {
        if(root == null)
            return 0;

        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);
        return (1 + Math.max(leftHeight, rightHeight));
    }

    public static void main(String[] args) {
        HeightOfTree bt = new HeightOfTree();

        bt.root = bt.insert(bt.root, 10);
        bt.root = bt.insert(bt.root, 15);
        bt.root = bt.insert(bt.root, 5);
        bt.root = bt.insert(bt.root, 7);
        bt.root = bt.insert(bt.root, 20);

        System.out.println("Recursively, the height of this tree is: " + bt.heightOfTree(bt.root));
    }
}
