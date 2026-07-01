import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class StudentServiceCenter {

    static Queue<String> queue = new LinkedList<>();
    static Stack<String> stack = new Stack<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            // Display Menu
            System.out.println("\n+++++STUDENT SERVICE CENTER+++++");
            System.out.println("1. Add Student Request");
            System.out.println("2. Serve Student");
            System.out.println("3. View Student Queue");
            System.out.println("4. View Transaction History");
            System.out.println("5. Exit\n");

            // User Input
            System.out.print("Enter: ");
            choice = sc.nextInt();
            sc.nextLine();

            // Menu choices logic
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    serveStudent();
                    break;
                case 3:
                    viewStudentQueue();
                    break;
                case 4:
                    viewTransactionHistory();
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid!");
            }
        } while (choice != 6);
    }

    public static void addStudent() {
        System.out.print("Enter name: "); // User student name
        String name = sc.nextLine();

        queue.offer(name); // Add student name
        String transaction = "Added: " + name; // Save student name
        stack.push(transaction); // push to stack

        System.out.println("Added!"); // Confirmation
    }

    public static void serveStudent() {
        if (queue.isEmpty()) { // Check queue
            System.out.println("Empty");

        } else {
            String serve = "Removed: " + queue.poll(); // Remove student
            stack.push(serve); // Save
            System.out.println("Served!"); // Output
        }
    }

    public static void viewStudentQueue() {
        if (queue.isEmpty()) { // Check queue
            System.out.println("Empty");
        } else {
            System.out.print("Student List:" + queue); // Display List
        }
    }

    public static void viewTransactionHistory() {
        if (stack.isEmpty()) { // Check stack
            System.out.println("No Transactions");
        } else {
            System.out.print("Transaction History: " + stack); // Display Transaction history
        }
    }
}
