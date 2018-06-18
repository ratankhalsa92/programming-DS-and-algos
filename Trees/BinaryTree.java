// Binary Search Tree - Insertion, Lookup (Search), DFS Traversals (Inorder, Preorder & Postorder)

import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = null;
        right = null;
    }
}

public class BinaryTree {
    Node root = null;
    Node root1 = null;

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

    public void preOrder(Node node) {
        if(node != null) {
            System.out.println(node.data);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void inOrder(Node node) {
        if(node != null) {
            inOrder(node.left);
            System.out.println(node.data);
            inOrder(node.right);
        }
    }

    public void postOrder(Node node) {
        if(node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.data);
        }
    }

    public Node search(Node node, int key) {
        if(node == null)
            return null;

        if(node.data == key)
            return node;

        else if(key < node.data)
            return search(node.left, key);
        else
            return search(node.right, key);
    }

    public boolean sameTree(Node root1, Node root2) {
        if(root1 == null && root2 == null)
            return true;

        if(root1 == null || root2 == null)
            return false;

        return (root1.data == root2.data && sameTree(root1.left, root2.left) && sameTree(root1.right, root2.right));
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.root = bt.insert(bt.root, 10);
        bt.root = bt.insert(bt.root, 15);
        bt.root = bt.insert(bt.root, 5);
        bt.root = bt.insert(bt.root, 7);
        bt.root = bt.insert(bt.root, 20);

        bt.inOrder(bt.root);
        bt.preOrder(bt.root);
        bt.postOrder(bt.root);

        System.out.println(bt.sameTree(bt.root, bt.root1));
    }
}
