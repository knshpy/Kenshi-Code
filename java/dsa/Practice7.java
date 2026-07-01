import java.util.Queue;
import java.util.LinkedList;

public class Practice7 {

    public static void main(String[] array) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.size());

    }
}
