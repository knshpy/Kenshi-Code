import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

// Queue FIFO
// Stack LIFO
// LinkedList for queue scalability

public class Practice8 {

    public static void queue(String[] array) {
        Queue<String> queue = new LinkedList<>();

        System.out.println("Queue:");

        // offer = add
        queue.offer(array[0]);
        queue.offer(array[1]);
        queue.offer(array[2]);
        queue.offer(array[3]);
        queue.offer(array[4]);

        System.out.println(queue); // Display queue

        System.out.println(queue.peek()); // view front element
        System.out.println(queue);

        System.out.println(queue.size()); // Display size
        System.out.println(queue);

        queue.poll(); // Remove first element
        System.out.println(queue);

         System.out.println(((LinkedList<String>)queue).getLast()); // Display last element
         System.out.println(queue.isEmpty()); // Check if empty

    }

    public static void stack(String[] array) {
        Stack<String> stack = new Stack<>();

        System.out.println("Stack:");

        System.out.println(stack.isEmpty()); // Check if stack empty

        // Add stacks
        stack.push(array[0]);
        stack.push(array[1]);
        stack.push(array[2]);
        stack.push(array[3]);
        stack.push(array[4]);

        System.out.println(stack); // Display stack

        System.out.println(stack.pop()); // Remove top element
        System.out.println(stack);

        System.out.println(stack.peek()); // View stack top element
        System.out.println(stack);

        System.out.println(stack.size()); // Display size

        System.out.println(); // Space

    }

    public static void main(String[] args) {
        Practice8 p = new Practice8();
        String[] array = {"a", "b", "c", "d", "e"};
        p.stack(array);
        p.queue(array);
    }
}
