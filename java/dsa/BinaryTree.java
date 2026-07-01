import java.util.LinkedList;
import java.util.Queue;

// /////////////////////////////////
// Pre-order = Root -> Left -> Right
// In-order = Left -> Root -> Right
// Post-order = Left -> Right -> Root
// ---------------------------------
// Node structure - [Value|pointer]
// null = node no where pointing to
// /////////////////////////////////

public class BinaryTree {

    static class Node {
        int data;
        Node left;
        Node right;

        // Constructor
        Node(int value) {
            data = value;
            left = null;
            right = null;
        }
    }

    static class BST {
        Node root;

        // Insertion Logic
        Node insert(Node root, int value) {

            if (root == null) {
                return new Node(value);
            }
            if (value < root.data) {
                root.left = insert(root.left, value);
            } else if (value > root.data) {
                root.right = insert(root.right, value);
            }
            return root;
        }

        boolean search(Node root, int key) {

            // Searching logic
            if (root == null) {
                return false;
            }
            if (root.data == key) {
                return true;
            }
            if (key < root.data) {
                return search(root.left, key);
            } else {
                return search(root.right, key);
            }
        }

        // Pre-order
        void preorder(Node root) {
            if (root != null) {
                System.out.print(root.data + " ");
                preorder(root.left);
                preorder(root.right);
            }
        }

        // In-order
        void inorder(Node root) {
            if (root != null) {
                inorder(root.left);
                System.out.print(root.data + " ");
                inorder(root.right);
            }
        }

        // Post-order
        void postorder(Node root) {
            if (root != null) {
                postorder(root.left);
                postorder(root.right);
                System.out.print(root.data + " ");
            }
        }
    }

    // Main
    public static void main(String[] args) {
        BST tree = new BST();

        // Insert nodes
        tree.root = tree.insert(tree.root,60);
        tree.root = tree.insert(tree.root,40);
        tree.root = tree.insert(tree.root,70);
        tree.root = tree.insert(tree.root,30);
        tree.root = tree.insert(tree.root,50);
        tree.root = tree.insert(tree.root,20);
        tree.root = tree.insert(tree.root,80);
        tree.root = tree.insert(tree.root,10);
        tree.root = tree.insert(tree.root,90);

        // Pre-order output
        System.out.print("PRE ORDER: ");
        tree.preorder(tree.root);

        System.out.println(); // Space

        // In-order output
        System.out.print("IN ORDER: ");
        tree.inorder(tree.root);

        System.out.println(); // Space

        // Post-order output
        System.out.print("POST ORDER: ");
        tree.postorder(tree.root);
        
        System.out.println(); // Space
        
        System.out.println("Search" + tree.search(tree.root, 20));
        System.out.println("Search" + tree.search(tree.root, 40));
    }

}
