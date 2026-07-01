
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Practice9 {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int value) { // Constructor
            data = value;
            left = null;
            right = null;
        }
    }

    static class BST {
        Node root;

        Node insert(Node root, int value) { // Insertion

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

        boolean search(Node root, int key) { // Searching

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

        void preorder(Node root) { // Pre order
            if (root != null) {
                System.out.print(root.data + " ");
                preorder(root.left);
                preorder(root.right);
            }
        }

        void inorder(Node root) {
            if (root != null) {
                inorder(root.left);
                System.out.print(root.data + " ");
                inorder(root.right);
            }
        }

        void postorder(Node root) {
            if (root != null) {
                postorder(root.left);
                postorder(root.right);
                System.out.print(root.data + " ");
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            BST tree = new BST();

            System.out.print("How many nodes?: ");
            int n = sc.nextInt();

            System.out.println(); // Spaces

            for (int i = 1; i <= n; i++) {
                System.out.print("Enter node value " + i + ": ");
                int value = sc.nextInt();

                tree.root = tree.insert(tree.root, value);
            }

            System.out.println(); // Spaces

            System.out.print("PRE ORDER: ");
            tree.preorder(tree.root);

            System.out.println(); // Space

            System.out.print("IN ORDER: ");
            tree.inorder(tree.root);

            System.out.println(); // Space

            System.out.print("POST ORDER: ");
            tree.postorder(tree.root);

            System.out.println(); // Space

            System.out.print("Search node: "); // Searh
            int key = sc.nextInt();

            if (tree.search(tree.root, key)) { // FOUND
                System.out.println("YES!");
            } else {
                System.out.println("NO!"); // NOT FOUND
            }

            sc.close();
        }
    }
}
